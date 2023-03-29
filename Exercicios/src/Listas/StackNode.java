package Listas;

public class StackNode<T> {

    private T data;

    private StackNode<T> prev;

    public StackNode(T data){

        this.data = data;
        this.prev = null;

    }

    public T getData() {
        return data;
    }

    public StackNode<T> getPrev() {
        return prev;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPrev(StackNode<T> prev) {
        this.prev = prev;
    }
}
