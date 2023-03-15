public class SinglyLinkedList {
    SLLNode head,tail;

    public SinglyLinkedList(){
        head = tail = null;
    }

    public void addToTail(int newValue){
        //when the list has no node(empty list)
        if(head == null){
            head = tail = new SLLNode(newValue, null);
        }else{

            tail.next = new SLLNode(newValue,null);//receives the address of the new node
            tail = tail.next;  //tail pointer points to the next node
            // tail stores the address of the new node
        }

    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addToHead(int newValue){
        //special case is when the list is empy
        if(isEmpty()){
            head = tail = new SLLNode(newValue,null);
        }else{
            head = new SLLNode(newValue,head);
            //create new node, put value of newValue,new node point to the head, head will point  to the new note
        }
    }
    public int deleteFromHead(){
        int firstInfo = head.info;
        //special case
        // list has only 1 node
        // list has no node
        if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
        return firstInfo;
    }

    public void printAllNodes(){
        for(SLLNode temp = head; temp != null; temp = temp.next){
            System.out.print(temp.info + " => ");
        }
        System.out.println(" end at null");
    }

    public int deleteFromTail(){
        if(head == null){
            return -1;
        }else if(head == tail){
            int lastInfo = tail.info;
            head = tail = null;
            return lastInfo;
        }else{
            int lastInfo = tail.info;
            SLLNode temp = head;
            for(temp = head; temp.next != tail; temp = temp.next){
                //loop of searching
                //nothing to do in this loop
            }
            temp.next = null;
            tail = temp;
            //temp will stop at the (n-1) th node [one before last

            return lastInfo;
        }
    }

    // homework
    public int deleteIthNode(int i) {
        if (head == tail || head == null) {
            return deleteFromTail();
        } 
        else if (i == 0) {
            return deleteFromHead();
        } 
        else {
            int info = tail.info;
            SLLNode ptr;
            int count = 0;
            for (ptr = head; ptr != null; ptr = ptr.next) {
                count++;
            }
            SLLNode temp = head;
            for (int j = 1; j <= count; j++) {
                if (j == i) {
                    temp.next = temp.next.next;
                    return info;
                }
                temp = temp.next;
            }
            return info;
        }
    }

    public void insertNodeAtIthInMiddle(int i, int newValue) {
        SLLNode ptr;
        int count = 0;
        for (ptr = head; ptr != null; ptr = ptr.next) {
            count++;
        }
        if (isEmpty()) {
            head = tail = new SLLNode(newValue);
        } 
        else if (i == 0) {
            addToHead(newValue);
        } 
        else if (i == count) {
            addToTail(newValue);
        } 
        else {
            SLLNode temp = head;
            for (int j = 1; j <= count; j++) {
                if (j == i) {
                    temp.next = new SLLNode(newValue, temp.next);
                }
                temp = temp.next;
            }
        }
    }
}
