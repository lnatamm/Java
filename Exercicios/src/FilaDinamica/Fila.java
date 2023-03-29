package FilaDinamica;

import java.util.*;

public class Fila<T> {

    private Node<T> first;

    private Node<T> last;

    private int cont;

    public Fila(){

        first = null;
        last = null;
        cont++;

    }

    public int size(){

        return cont;

    }

    public void add(T data){

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

    }

    public T poll(){

        Node<T> node;

        if(first == null){

            throw new EmptyStackException();

        }

        else {

            node = first;
            first = first.getNext();
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

        while (curr.getNext() != null){

            s += curr.getData() + " ";

        }

        return s + curr.getData() + "]";

    }

}
