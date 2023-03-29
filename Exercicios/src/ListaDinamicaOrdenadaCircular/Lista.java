package ListaDinamicaOrdenadaCircular;

public class Lista<T> {

    private Node<T> head;

    private Node<T> tail;

    private int cont;

    public Lista(){

        head = null;
        tail = null;
        cont = 0;

    }

    public int size(){return 0;}

    public boolean isEmpty(){return false;}

    public void add(){}

    public void add(int i, T n){}

    public void clear(){}

    public boolean contains(T n){return false;}

    public void remove(T n){}

    public void remove(int i){}

    public T get(int i){return null;}

    public int indexOf(T n){return -1;}

    @Override
    public String toString(){return null;}

}
