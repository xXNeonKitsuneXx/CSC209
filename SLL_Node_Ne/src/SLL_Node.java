public class SLL_Node {
    int info;
    SLL_Node next;

    public SLL_Node(int info, SLL_Node next) {
        this.info = info;
        this.next = next;
    }

    public SLL_Node(int info) {
        this(info,null);
    }

    public int getInfo() {
        return info;
    }

    public SLL_Node getNext() {
        return next;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public void setNext(SLL_Node next) {
        this.next = next;
    }
}
