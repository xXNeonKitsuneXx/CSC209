public class SinglyLinkedList {
    SLL_Node head, tail;

    public SinglyLinkedList() {
        head = tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addToHead(int newValue){
        if (isEmpty()) { //If no node at start
            head = tail = new SLL_Node(newValue,head);
        }
        else { //Normal case
            head = new SLL_Node(newValue,head);
            //Create new node, Put value of newValue,
            // New node point to the head,
        }
    }

    public void addToTail(int newValue){
        if (isEmpty()) { //If no node at start
            head = tail = new SLL_Node(newValue,null);
        }
        else { //Normal case
            tail = tail.next = new SLL_Node(newValue,null);

//            tail.next = new SLLNode(newValue,null);
//            tail = tail.next;

            //Receives the address of the new node
            //Tail pointer points to the next node
            //Tail stores the address of the new node
        }
    }

    public int deleteFromHead() {
        int firstInfo = head.info; //For return

        if (head == tail){ //Has only 1 node OR Has 0 node
            head = tail = null;
        }
        else {
            head = head.next;
        }

        return firstInfo;
    }

    public int deleteFromTail() {
        if (isEmpty()) { //Case 0 node
            return -1;
        }
        else if (head == tail) { //Case 1 node
            int lastInfo = tail.info;
            head = tail = null;
            return lastInfo;
        }
        else {//Case more than 1 node
            int lastInfo = tail.info;
            SLL_Node temp;

            for (temp = head; temp.next != tail; temp = temp.next);
            // ^ For loop find tail
            temp.next = null;
            tail = temp;
            //temp will stop at the (n-1)th node [one before last]

            return lastInfo;
        }
    }

    public void printAllNodes() {
        for (SLL_Node temp = head; temp != null; temp = temp.next) {
            System.out.print(temp.info + " => ");
        }
        System.out.println("end at null");
    }

    public boolean isInList(int check) {
        if (head == null) { //No node
            return false;
        }
        else if (head == tail) {//One node
            if (head.info == check) {
                return true;
            }
        }
        else {
            for (SLL_Node temp = head; temp != null; temp = temp.next) {
                if (temp.info == check) {
                    return true;
                }
            }
        }
        return false;
    }

    public void deleteAtEL(int deleteEL) {
        if (!isEmpty()) {
            if (head == tail) { //One node
                if (head.info == deleteEL) {
                    head = tail = null;
                }
            }
            else if (deleteEL == head.info){ //Want to delete at Head
                head = head.next;
            }
            else {
                SLL_Node prev, temp;
                for (prev = head, temp = head.next;
                     temp != null && temp.info != deleteEL;
                     prev = prev.next, temp = temp.next);
                // ^ Loop until end or temp == deleteEL

                if (temp != null) {
                    prev.next = temp.next; // Normal case [In mid]

                    if (temp == tail) { // Tail case
                        tail = prev;
                        tail.next = null;
                    }
                }
            }
        }
    }


}