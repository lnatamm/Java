package ListaDinamicaCircular;

import java.util.Iterator;

public class ListaIterator<T> implements Iterator<T> {

    private Node<T> curr;

    private int atual;

    private int fim;

    public ListaIterator(Node<T> head, int cont){

        curr = head;
        atual = 0;
        fim = cont;

    }

    @Override
    public boolean hasNext() {
        return atual != fim;
    }

    @Override
    public T next() {
        T data = curr.getData();
        curr = curr.getNext();
        atual++;
        return data;
    }
}
