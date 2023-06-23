public class DLL_Main {
    public static void main(String[] args) {
        DoublyLinkedList list1 = new DoublyLinkedList();
        list1.printAll(); // List is Empty

        list1.addToHead(23);
        list1.printAll(); // 23

        list1.addToTail(34);
        list1.printAll(); // 23 => 34

        list1.addToHead(12);
        list1.addToTail(45);
        list1.addToTail(67);
        list1.printAll(); // 12 => 23 => 34 => 45 => 67

        list1.removeFromHead();
        list1.printAll(); // 23 => 34 => 45 => 67

        list1.removeFromTail();
        list1.printAll(); // 23 => 34 => 45


    }
}
