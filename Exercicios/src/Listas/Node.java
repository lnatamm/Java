package Listas;

public class Node<T>{

    private T data;

    private Node<T> next;

    public Node(T data){

        this.data = data;

        this.next = null;

    }

    public T getData() {

        return this.data;

    }

    public Node getNext(){

        return this.next;

    }

    public void setData(T data){

        this.data = data;

    }

    public void setNext(Node<T> next){

        this.next = next;

    }

}
