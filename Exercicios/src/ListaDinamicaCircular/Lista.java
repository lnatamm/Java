package ListaDinamicaCircular;

import java.util.Iterator;

public class Lista<T> implements Iterable<T>{

    private Node<T> head;

    private Node<T> tail;

    private int cont;

    public Lista(){

        head = null;
        tail = null;
        cont = 0;

    }

    public int size(){

        return cont;

    }

    public boolean isEmpty(){

        return head == null;

    }

    public void add(T n){

        Node<T> node = new Node(n);

        if(head == null){

            head = node;
            tail = node;
            cont++;

        }

        else {

            tail.setNext(node);
            tail = node;
            tail.setNext(head);
            cont++;

        }

    }

    public void add(int i, T n){

        Node<T> node = new Node(n);

        if(i == 0){

            tail.setNext(node);
            node.setNext(head);
            head = node;
            cont++;

        }

        else if(i == cont){

            tail.setNext(node);
            tail = node;
            tail.setNext(head);
            cont++;

        }

        else {

            Node<T> aux = head;

            for(int j = 0; j < i - 1; j++){

                aux = aux.getNext();

            }

            node.setNext(aux.getNext());
            aux.setNext(node);
            cont++;

        }

    }

    public void clear(){

        head = null;
        tail = null;
        cont = 0;

    }

    public boolean contains(T n){

        Node<T> aux = head;

        for(int i = 0; i < cont; i++){

            if(aux.getData().equals(n)){

                return true;

            }

            aux = aux.getNext();

        }

        return false;

    }

    public void remove(T n){

        if(head.getData().equals(n)){

            head = head.getNext();
            tail.setNext(head);
            cont--;

        }

        else if(tail.getData().equals(n)){

            Node<T> aux = head;

            while (!aux.getNext().equals(tail)){

                aux = aux.getNext();

            }

            aux.setNext(head);
            tail = aux;
            cont--;

        }

        else {

            Node<T> aux = head;

            while(!aux.getNext().equals(n)){

                aux = aux.getNext();

            }

            aux.setNext(aux.getNext().getNext());
            cont--;

        }

    }

    public void remove(int i){

        if(i == 0){

            head = head.getNext();
            tail.setNext(head);
            cont--;

        }

        else if(i == cont){

            Node<T> aux = head;

            while (!aux.getNext().equals(tail)){

                aux = aux.getNext();

            }

            aux.setNext(head);
            tail = aux;
            cont--;

        }

        else {

            Node<T> aux = head;

            for(int j = 0; j < i - 1; j++){

                aux = aux.getNext();

            }

            aux.setNext(aux.getNext().getNext());
            cont--;

        }

    }


    public T get(int i){

        Node<T> aux = head;

        for(int j = 0; j < i; j++){

            aux = aux.getNext();

        }

        return aux.getData();

    }

    public int indexOf(T n){

        Node<T> aux = head;

        int cnt = 0;

        for(int i = 0; i < cont; i++){

            if(aux.getData().equals(n)){

                return cnt;

            }

            aux = aux.getNext();
            cnt++;

        }

        return -1;

    }

    @Override
    public String toString(){

        Node<T> aux = head;

        String string = "";

        for(int i = 0; i < cont; i++){

            string += aux.getData() + " ";
            aux = aux.getNext();

        }

        return string;

    }

    @Override
    public Iterator<T> iterator() {
        return new ListaIterator<T>(head, cont);
    }

}
