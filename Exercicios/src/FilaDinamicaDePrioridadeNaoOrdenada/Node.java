package FilaDinamicaDePrioridadeNaoOrdenada;

public class Node <T> {

    private T data;

    private int priority;

    private Node<T> next;

    private Node<T> prev;

    public Node(T data, int priority){

        this.data = data;
        this.priority = priority;
        this.next = null;
        this.prev = null;

    }

    public T getData() {
        return data;
    }

    public int getPriority() {
        return priority;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

}
