package Trilhos;

public class Node<T> {

    private T data;

    private Node<T> prev;

    public Node(T data){

        this.data = data;
        this.prev = null;

    }

    public T getData() {
        return data;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

}
