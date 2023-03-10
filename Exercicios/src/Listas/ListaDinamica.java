package Listas;

public class ListaDinamica <T extends Comparable<T>> {

    private Node<T> head;

    private Node<T> tail;

    private int cont;

    public ListaDinamica(){

        this.head = null;

        this.tail = null;

        this.cont = 0;

    }

    public void add(T n){

        Node<T> node = new Node<T>(n);

        if(this.head == null){

            this.head = node;
            this.tail = node;

            this.cont++;

        }

        else{

            this.tail.setNext(node);
            this.tail = node;

            this.cont++;

        }

    }

    public void add(int i, T n){

        Node<T> node = new Node<T>(n);

        Node<T> aux = this.head;

        if(i == 0){

            if (this.head == null) {

                this.head = node;
                this.tail = node;

                this.cont++;

            } else {

                node.setNext(this.head);
                this.head = node;

                this.cont++;

            }

        }

        else if(i == cont){

            this.tail.setNext(node);
            this.tail = node;

            this.cont++;

        }

        else {

            if (this.head == null) {

                throw new IndexOutOfBoundsException();

            }

            else {

                for(int j = 0; j < i; j++){

                    if(j == (i - 1)){

                        try {

                            node.setNext(aux.getNext());

                            aux.setNext(node);

                            this.cont++;

                        }

                        catch (NullPointerException e){

                        }

                    }

                    else{

                        aux = aux.getNext();

                    }

                }

            }

        }

    }

    public int size(){

        return this.cont;

    }

    public void clear(){

        this.head = null;
        this.tail = null;

    }

    public boolean contains(Object n){

        Node<T> aux = this.head;

        while(aux != null){

            if(aux.getData().equals(n)){

                return true;

            }

            aux = aux.getNext();

        }

        return false;

    }

    public void remove(Object n){

        Node<T> aux = this.head;

        if(this.head.getData().equals(n)){

            this.head = this.head.getNext();

        }

        else if(this.tail.getData().equals(n)){

            while (aux.getNext() != this.tail){

                aux = aux.getNext();

            }

            this.tail = aux;

        }

        else {

            while (aux.getNext() != null) {

                if (aux.getNext().getData().equals(n)) {

                    aux.setNext(aux.getNext().getNext());

                    break;

                }

                aux = aux.getNext();

            }

        }

    }

    public void remove(int i){

        Node<T> aux = this.head;

        if(i == 0){

            if (this.head == null) {

                throw new NullPointerException();

            } else {

                this.head = this.head.getNext();

            }

        }

        else if(i == cont - 1){

            while (aux.getNext() != this.tail){

                aux = aux.getNext();

            }

            this.tail = aux;

        }

        else {

            for(int j = 0; j < i; j++){

                if(j == (i - 1)){

                    aux.setNext(aux.getNext().getNext());

                }

                aux = aux.getNext();

            }

        }

    }

    public T get(int i){

        Node<T> aux = this.head;

        for(int j = 0; j < i; j++){

            aux = aux.getNext();

        }

        return aux.getData();

    }

    public int indexOf(T n){

        Node<T> aux = this.head;

        int cont = 0;

        while (aux != null){

            if(aux.getData().equals(n)){

                return cont;

            }

            aux = aux.getNext();

            cont++;

        }

        return -1;

    }

    public void show(){

        Node<T> aux = this.head;

        while(aux != null){

            System.out.print(aux.getData() + " ");

            aux = aux.getNext();

        }

        System.out.println();

    }

}
