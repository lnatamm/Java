package ListaDinamicaDuplamenteEncadeadaOrdenada;

import java.util.Iterator;

public class ListaIterator<T extends Comparable<T>> implements Iterator<T> {

    private Node<T> curr;

    public ListaIterator(Node<T> head){

        curr = head;

    }

    @Override
    public boolean hasNext(){

        return curr != null;

    }

    @Override
    public T next(){

        T data = curr.getData();
        curr = curr.getNext();
        return data;

    }

}
