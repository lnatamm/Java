package Trilhos;

public class NodeFila<T> {

    private T data;

    private NodeFila<T> next;

    private NodeFila<T> prev;

    public NodeFila(T data){

        this.data = data;
        this.next = null;
        this.prev = null;

    }

    public T getData() {
        return data;
    }

    public NodeFila<T> getNext() {
        return next;
    }

    public NodeFila<T> getPrev() {
        return prev;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(NodeFila<T> next) {
        this.next = next;
    }

    public void setPrev(NodeFila<T> prev) {
        this.prev = prev;
    }

}
