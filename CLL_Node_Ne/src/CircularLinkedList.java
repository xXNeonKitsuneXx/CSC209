public class CircularLinkedList {
    CLL_Node tail;

    public CircularLinkedList() {
        tail = null;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    public void addToTail(int newValue) {
        if (isEmpty()) { //No node at start
            tail = new CLL_Node(newValue);
            tail.next = tail;
        }
        else { //Normal case
            tail.next = new CLL_Node(newValue, tail.next);
            tail = tail.next;
        }
    }

    public void addToHead(int newValue) {
        if (isEmpty()) { //No node at start
            tail = new CLL_Node(newValue);
            tail.next = tail;
        }
        else { //Normal case
            tail.next = new CLL_Node(newValue, tail.next);
        }
    }

    public int removeFromTail() {
        if (isEmpty()) { //No node to remove
            return -1;
        }
        else if (tail.next == tail) { //Only one node in the list
            int removedValue = tail.info;
            tail = null;
            return removedValue;
        }
        else { //Normal case
            CLL_Node current = tail.next;
            while (current.next != tail) {
                current = current.next;
            }

            int removedValue = tail.info;
            current.next = tail.next;
            tail = current;
            return removedValue;
        }
    }

    public int removeFromHead() {
        if (isEmpty()) { //No node to remove
            return -1;
        }
        else if (tail.next == tail) { //Only one node in the list
            int removedValue = tail.info;
            tail = null;
            return removedValue;
            //Can just 'tail = null;'
            //Not need to write removedValue
            //It just for study
        }
        else { //Normal case
            int removedValue = tail.next.info;
            tail.next = tail.next.next;
            return removedValue;
        }
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        }
        else {
            CLL_Node current = tail.next;
            do {
                System.out.print(current.info + " => ");
                current = current.next;
            } while (current != tail.next);
            System.out.println("Back to Head");
        }
    }
}
