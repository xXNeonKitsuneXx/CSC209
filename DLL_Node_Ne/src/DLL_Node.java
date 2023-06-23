public class DLL_Node {
    int info;
    DLL_Node next, prev;

    public DLL_Node(int info, DLL_Node next, DLL_Node prev) {
        this.info = info;
        this.next = next;
        this.prev = prev;
    }

    public DLL_Node(int info) {
        this(info,null,null);
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public DLL_Node getNext() {
        return next;
    }

    public void setNext(DLL_Node next) {
        this.next = next;
    }

    public DLL_Node getPrev() {
        return prev;
    }

    public void setPrev(DLL_Node prev) {
        this.prev = prev;
    }
}
