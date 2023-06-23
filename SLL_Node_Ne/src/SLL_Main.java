public class SLL_Main {
    public static void main(String[] args) {
        SLL_Node node1 = new SLL_Node(50);
        System.out.println(node1); //Address node1
        System.out.println(node1.info); //50
        System.out.println(node1.info + " => " + node1.next); //50 => null

        SLL_Node node2 = new SLL_Node(60,node1);
        // ^ node2 => node 1 [60 => 50]
        System.out.println(node2.info); //60
        System.out.println(node2.next.info); //50

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        SinglyLinkedList list1 = new SinglyLinkedList();
        System.out.println(list1.head); //null
        list1.printAllNodes(); // "end at null" because no node
        list1.addToTail(66); //Head and tail will point to node 66
        System.out.println("Head: " + list1.head.info + "| Tail: " + list1.tail.info);
        // ^ 66

        list1.addToTail(79);
        System.out.println("Head: " + list1.head.info + "| Tail: " + list1.tail.info);
        // ^ 66 => 79

        list1.addToHead(34);
        System.out.println("Head: " + list1.head.info + "| Tail: " + list1.tail.info);
        // ^ 34 => 66 => 79

        list1.printAllNodes();
        // ^ 34 => 66 => 79 => end at null

        list1.addToHead(212);
        list1.addToTail(699);
        list1.printAllNodes();
        // ^ 212 => 34 => 66 => 79 => 699 => end at null

        list1.deleteFromHead();
        list1.printAllNodes();
        // ^ 34 => 66 => 79 => 699 => end at null

        list1.deleteFromTail();
        list1.printAllNodes();
        // ^ 34 => 66 => 79 => end at null

        System.out.println(list1.isInList(39));
        System.out.println(list1.isInList(66));

        list1.deleteAtEL(66);
        list1.printAllNodes();
        // ^ 34 => 79 => end at null

        list1.deleteAtEL(99); //No case [Not has 99]
        list1.printAllNodes();
        // ^ 34 => 79 => end at null

        list1.addToTail(98);
        list1.printAllNodes();
        // ^ 34 => 79 => 98 => end at null

        list1.deleteAtEL(34);
        list1.printAllNodes();
        // ^ 79 => 98 => end at null

        list1.deleteAtEL(98);
        list1.printAllNodes();
        // ^ 79 => end at null

        list1.deleteAtEL(79);
        list1.printAllNodes();
        // ^ end at null

    }
}