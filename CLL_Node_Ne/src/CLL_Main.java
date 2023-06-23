public class CLL_Main {
    public static void main(String[] args) {
        CircularLinkedList list1 = new CircularLinkedList();
        list1.printAll(); // The list is empty.

        list1.addToTail(10);
        list1.addToTail(20);
        list1.addToHead(30);
        list1.printAll(); // 30 => 10 => 20 => Back to Head

        list1.addToHead(40);
        list1.addToTail(50);
        list1.printAll(); // 40 => 30 => 10 => 20 => 50 => Back to Head

        list1.removeFromHead();
        list1.printAll(); // 30 => 10 => 20 => 50 => Back to Head

        list1.removeFromTail();
        list1.printAll(); // 30 => 10 => 20 => Back to Head
    }
}
