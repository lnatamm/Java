package FilaDoRecreio;

import java.util.*;

public class FilaDePrioridade<T> implements Iterable<T>{

    @Override
    public Iterator<T> iterator() {
        return new FilaIterator();
    }

    private class FilaIterator implements Iterator<T> {

        private NodePrioridade<T> curr;

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

    private NodePrioridade<T> first;

    private NodePrioridade<T> last;

    private int cont;

    public FilaDePrioridade(){

        first = null;
        last = null;
        cont = 0;

    }

    public int size(){

        return cont;

    }

    public void enqueue(T data, int priority){

        NodePrioridade<T> node = new NodePrioridade<>(data, priority);

        if(first == null){

            first = node;
            last = node;
            cont++;

        }

        else {

            if(first.getPriority() < node.getPriority()){

                node.setNext(first);
                first.setPrev(node);
                first = node;
                cont++;

            }

            else if(last.getPriority() >= node.getPriority()){

                node.setPrev(last);
                last.setNext(node);
                last = node;
                cont++;

            }

            else {

                NodePrioridade<T> aux = first;

                while (aux.getPriority() >= node.getPriority()){

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

        NodePrioridade<T> node;

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

    public boolean isEmpty(){

        return first == null;

    }

    @Override
    public String toString(){

        String s = "[";

        NodePrioridade<T> curr = first;

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
