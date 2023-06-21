package ListaDeCompras;

public class Node<T extends Comparable<T>> {

    private T data;

    private Node<T> next;

    private Node<T> previous;

    public Node(T data){
        this.data = data;
        next = null;
        previous = null;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext(){
        return next;
    }

    public Node<T> getPrevious(){
        return previous;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrevious(Node<T> previous){
        this.previous = previous;
    }

}
