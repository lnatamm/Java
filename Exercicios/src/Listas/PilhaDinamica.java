package Listas;

import java.util.EmptyStackException;

public class PilhaDinamica<T> {

    private StackNode<T> top;

    private int cont;

    public PilhaDinamica(){

        top = null;
        cont = 0;

    }

    public void push(T data){

        StackNode<T> node = new StackNode<>(data);

        if(top == null){

            top = node;
            cont++;

        }

        else {

            node.setPrev(top);
            top = node;
            cont++;

        }

    }

    public T pop(){

        StackNode<T> node;

        if(top == null){

            throw new EmptyStackException();

        }

        else {

            node = top;
            top = top.getPrev();
            return node.getData();

        }

    }

    public T peek(){

        StackNode<T> node;

        if(top == null){

            throw new EmptyStackException();

        }

        else {

            node = top;
            return node.getData();

        }

    }

    public int size(){

        return cont;

    }

    @Override
    public String toString(){

        String s = "[";

        StackNode<T> node = top;

        while (node.getPrev() != null){

            s+= node.getData();

        }

        s += node.getData() + "]";

        return s;

    }

}
