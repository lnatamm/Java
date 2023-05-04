package Fila;

import java.util.*;

public class Fila<T> implements Iterable<T>{

    @Override
    public Iterator<T> iterator() {
        return new FilaIterator();
    }

    private class FilaIterator implements Iterator<T> {

        private Node<T> curr;

        public FilaIterator(){

            curr = first;

        }
        @Override
        public boolean hasNext() {
            return curr != null;
        }

        @Override
        public T next() {
            T data = curr.getData();
            curr = curr.getNext();
            return data;
        }

    }

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

    public T dequeue(int i){

        Node<T> node;

        if(first == null){

            throw new EmptyStackException();

        }

        else {

            if (i == 0) {

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

            else if (i == cont - 1) {

                node = last;
                last = last.getPrev();
                try{
                    last.setNext(null);
                }
                catch (NullPointerException e){
                    first = null;
                    last = null;
                }

                cont--;
                return node.getData();

            }

            else {

                Node<T> aux = first;

                for(int j = 0; j < i; j++){

                    aux = aux.getNext();

                }

                node = aux;
                aux.getPrev().setNext(aux.getNext());

            }

            return node.getData();

        }

    }

    public T dequeue(T n){

        Node<T> node;

        if(first == null){

            throw new EmptyStackException();

        }

        else {

            if (n.equals(first.getData())) {

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

            else if (n.equals(last.getData())) {

                node = last;
                last = last.getPrev();
                try{
                    last.setNext(null);
                }
                catch (NullPointerException e){
                    first = null;
                    last = null;
                }

                cont--;
                return node.getData();

            }

            else {

                Node<T> aux = first;

                while (!aux.getData().equals(n)){

                    aux = aux.getNext();

                }

                node = aux;
                aux.getPrev().setNext(aux.getNext());
                cont--;
                return node.getData();

            }

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
