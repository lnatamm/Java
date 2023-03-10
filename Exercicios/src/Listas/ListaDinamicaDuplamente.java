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


        }

    }

}
