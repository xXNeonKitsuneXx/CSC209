public class CLL_Node {
    int info;
    CLL_Node next;

    public CLL_Node(int info, CLL_Node next) {
        this.info = info;
        this.next = next;
    }

    public CLL_Node(int info) {
        this(info, null);
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public CLL_Node getNext() {
        return next;
    }

    public void setNext(CLL_Node next) {
        this.next = next;
    }
}
