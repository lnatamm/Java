package FilaDinamicaDePrioridadeNaoOrdenada;

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

    public void enqueue(T data, int priority){

        Node<T> node = new Node(data, priority);

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
            Node<T> highPriority = first;

            while (node != null){

                try {

                    if (highPriority.getPriority() > node.getNext().getPriority()) {
                        highPriority = node.getNext();
                    }

                }

                catch (NullPointerException e){


                }

                node = node.getNext();

            }

            if(highPriority.equals(first)){


                first = first.getNext();
                try {
                    first.setPrev(null);
                }
                catch (NullPointerException e){
                    first = null;
                    last = null;
                }

            }

            else if(highPriority.equals(last)){

                last = last.getPrev();
                try {
                    last.setNext(null);
                }
                catch (NullPointerException e){
                    first = null;
                    last = null;
                }
            }

            else {

                highPriority.getPrev().setNext(highPriority.getNext());
                highPriority.getNext().setPrev(highPriority.getPrev());

            }

            cont--;
            return highPriority.getData();

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

    public boolean isEmpty(){
        return first == null;
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
