package Listas;

public class ListaDinamicaDuplamente<T extends Comparable<T>> {

    private DoubleNode<T> head;

    private DoubleNode<T> tail;

    private int cont;

    public ListaDinamicaDuplamente(){

        this.head = null;

        this.tail = null;

        this.cont = 0;

    }

    public void add(T n){

        DoubleNode<T> node = new DoubleNode<>(n);

        if(this.tail == null){

            this.head = node;
            this.tail = node;

            this.cont++;

        }

        else {

            node.setPrevious(this.tail);
            this.tail.setNext(node);
            this.tail = node;

            this.cont++;

        }

    }

    public void add(int i, T n){

        DoubleNode<T> node = new DoubleNode<>(n);

        if(i == 0){

            this.head.setPrevious(node);
            node.setNext(this.head);
            this.head = node;
            this.cont++;

        }

        else if(i == cont - 1){

            node.setPrevious(this.tail);
            this.tail.setNext(node);
            this.tail = node;
            this.cont++;

        }

        else {

            DoubleNode<T> aux = this.head;

            for(int j = 0; j < i; j++){

                aux = aux.getNext();

            }

            aux.getPrevious().setNext(node);
            node.setPrevious(aux.getPrevious());
            aux.setPrevious(node);
            node.setNext(aux);
            cont++;

        }

    }

    public int size(){

        return cont;

    }

    public void clear(){

        head = null;
        tail = null;
        cont = 0;

    }

    public void remove(T n){

        if(head.getData().equals(n)){

            head = head.getNext();

        }

        else if(tail.getData().equals(n)){

            tail = tail.getPrevious();

        }

        else {

            DoubleNode<T> aux = head;

            while (!aux.getData().equals(n)){

                aux = aux.getNext();

            }

            aux.getPrevious().setNext(aux.getNext());

        }

    }

    public void remove(int i){

        if(i == 0){

            head = head.getNext();

        }

        else if(i == cont){

            tail = tail.getPrevious();

        }

        else {

            DoubleNode<T> aux = head;

            for(int j = 0; j < i; j++){

                aux = aux.getNext();

            }

            aux.getPrevious().setNext(aux.getNext());

        }

    }

    public T get(int i){

        DoubleNode<T> aux = head;

        for(int j = 0; j < i; j++){

            aux = aux.getNext();

        }

        return aux.getData();

    }

    public boolean contains(T n){

        DoubleNode<T> aux = head;

        while (aux != null){

            if(aux.getData().equals(n)){

                return true;

            }

            aux = aux.getNext();

        }

        return false;

    }

    public int indexOf(T n){

        DoubleNode<T> aux = head;

        int cnt = 0;

        while (aux != null){

            if(aux.getData().equals(n)){

                return cnt;

            }

            cnt++;

        }

        return - 1;

    }

    @Override
    public String toString(){

        DoubleNode<T> aux = head;

        String string = "";

        while(aux != null){

            string += aux.getData() + " ";

            aux = aux.getNext();

        }

        return string;

    }

}
