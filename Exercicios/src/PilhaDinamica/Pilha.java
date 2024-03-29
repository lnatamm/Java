package PilhaDinamica;

import Fila.Fila;

import java.util.*;

public class Pilha<T> implements Iterable<T>{

    @Override
    public Iterator<T> iterator() {
        return new PilhaIterator();
    }

    private class PilhaIterator implements Iterator<T> {

        private Node<T> curr;

        public PilhaIterator(){
            curr = top;
        }
        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public T next() {
            T data = curr.getData();
            curr = curr.getPrev();
            return data;
        }

    }

    private Node<T> top;

    private int cont;

    public Pilha(){
        top = null;
        cont = 0;
    }

    public int size(){
        return cont;
    }

    public void push(T data){
        Node<T> node = new Node<>(data);
        if(top == null){
            top = node;
        }
        else {
            node.setPrev(top);
            top = node;
        }
        cont++;
    }

    public T pop(){
        Node<T> node;
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
        Node<T> node;
        if(top == null){
            throw new EmptyStackException();
        }
        else {
            node = top;
            return node.getData();
        }
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void clear(){
        top = null;
        cont = 0;
    }

    @Override
    public String toString(){
        String s = "";
        Node<T> curr = top;
        while (curr.getPrev() != null){
            s += curr.getData() + " ";
            curr = curr.getPrev();
        }
        return s + curr.getPrev();
    }

}
