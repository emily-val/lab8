public class Node implements NodeFunctions {
    private int data;
    private Node next;
    private Node prev;
    public Node(Integer data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    public Node(Integer data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
    public int getData() {
        return data;
    }
    public Node getNext() {
        return next;
    }
    public Node getPrev() {
        return prev;
    }
    public void setData(int data) {
        this.data = data;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public String toString() {
        return "(" + data + ")";
    }
}