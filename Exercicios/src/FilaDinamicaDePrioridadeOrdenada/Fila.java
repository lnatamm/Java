package FilaDinamicaDePrioridadeOrdenada;

import java.util.EmptyStackException;

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
            cont++;

        }

        else {

            if(first.getPriority() > node.getPriority()){

                node.setNext(first);
                first.setPrev(node);
                first = node;
                cont++;

            }

            else if(last.getPriority() <= node.getPriority()){

                node.setPrev(last);
                last.setNext(node);
                last = node;
                cont++;

            }

            else {

                Node<T> aux = first;

                while (aux.getPriority() <= node.getPriority()){

                    aux = aux.getNext();

                }

                aux.getPrev().setNext(node);
                node.setPrev(aux.getPrev());
                node.setNext(aux);
                aux.setPrev(node);
                cont++;

            }

        }

    }

    public T dequeue(){

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
