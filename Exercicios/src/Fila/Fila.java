package Fila;

import java.util.*;

public class Fila<T> {

    private Node<T> first;

    private Node<T> last;

    private int cont;

    public Fila(){

        first = null;
        last = null;
        cont = 0;

    }

    public int size(){

        return cont;

    }

    public void enqueue(T data){

        Node<T> node = new Node<>(data);

        if(first == null){

            first = node;
            last = node;

        }

        else {

            node.setPrev(last);
            last.setNext(node);
            last = node;

        }

        cont++;

    }

    public T dequeue(){

        Node<T> node;

        if(first == null){

            throw new EmptyStackException();

        }

        else {

            node = first;
            first = first.getNext();
            try {
                first.setPrev(null);
            }
            catch (NullPointerException e){
                first = null;
                last = null;
            }

            cont--;
            return node.getData();

        }

    }

    public T peek(){

        if(first == null){

            throw new EmptyStackException();

        }

        else {

            return first.getData();

        }

    }

    @Override
    public String toString(){

        String s = "[";

        Node<T> curr = first;

        if(first != null) {

            while (curr.getNext() != null) {

                s += curr.getData() + " ";
                curr = curr.getNext();

            }

            return s + curr.getData() + "]";

        }

        return "";

    }

}
