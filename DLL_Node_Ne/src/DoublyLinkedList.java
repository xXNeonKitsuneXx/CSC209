public class DoublyLinkedList {
    DLL_Node head, tail;

    public DoublyLinkedList() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToHead(int newValue) {
        if (isEmpty()) { //No node at start
            head = tail = new DLL_Node(newValue);
        }
        else { //Normal case
            head.prev = new DLL_Node(newValue, head, null);
            head = head.prev;
        }
    }

    public int removeFromHead() {
        if (isEmpty()) { //No node to remove
            return -1;
        }
        else if (head == tail) { //Only one node in the list
            int removedValue = head.info;
            head = tail = null;
            return removedValue;
        }
        else { //Normal case
            int removedValue = head.info;
            head = head.next;
            head.prev = null;
            return removedValue;
        }
    }

    public void addToTail(int newValue) {
        if (isEmpty()) { //No node at start
            head = tail = new DLL_Node(newValue);
        }
        else { //Normal case
            tail.next = new DLL_Node(newValue, null, tail);
            tail = tail.next;
        }
    }

    public int removeFromTail() {
        if (isEmpty()) { //No node to remove
            return -1;
        }
        else if (head == tail) { //Only one node in the list
            int removedValue = tail.info;
            head = tail = null;
            return removedValue;
        }
        else { //Normal case
            int removedValue = tail.info;
            tail = tail.prev;
            tail.next = null;
            return removedValue;
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("List is empty.");
        }
        else {
            DLL_Node current = head;
            System.out.print("List contents: ");
            while (current != null) {
                System.out.print(current.info + " => ");
                current = current.next;
            }
            System.out.println("end at null");
        }
    }


}
