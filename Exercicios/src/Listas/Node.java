package Listas;

public class Node<T extends Comparable<T>> {

    private T data;

    private Node<T> next;

    public Node(T data){

        this.data = data;

        this.next = null;

    }

    public T getData() {

        return this.data;

    }

    public Node<T> getNext(){

        return this.next;

    }

    public void setData(T data){

        this.data = data;

    }

    public void setNext(Node<T> next){

        this.next = next;

    }
}
