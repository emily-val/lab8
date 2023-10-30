public class LinkedList implements LinkedListFunctions {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public Node getHead() {
        return head;
    }
    public Node getTail() {
        return tail;
    }
    public void setHead(Node head) {
        this.head = head;
    }
    public void setTail(Node tail) {
        this.tail = tail;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public void append(Node n) throws IllegalArgumentException {
        size += 1;
        if (n == null) {
            throw new IllegalArgumentException("Your node cannot be null");
        }
        if(tail == null) {
            head = n;
            tail = n;
        } else {
            tail.setNext(n);
            tail = n;
        }
    }
    public String toString() {
        String str = "";
        Node current = head;
        while(current != null) {
            str += current.toString() + " -> ";
            current = current.getNext();
        }
        str += "END";
        return str;
    }
}
