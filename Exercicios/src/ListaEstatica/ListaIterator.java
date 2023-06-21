package ListaEstatica;

import java.util.Iterator;
import java.util.Objects;

public class ListaIterator <T> implements Iterator<T> {

    private T[] v;

    private int atual;

    private int fim;

    public ListaIterator(T[]v, int cont){
        this.v = v;
        atual = 0;
        fim = cont;
    }

    @Override
    public boolean hasNext() {
        return atual != fim;
    }

    @Override
    public T next() {
        T data = v[atual];
        atual++;
        return data;
    }
}
