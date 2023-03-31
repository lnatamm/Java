package ListaDinamicaDuplamenteEncadeadaOrdenada;

import java.util.Iterator;

public class Lista<T extends Comparable<T>> implements Iterable<T>{

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

            if(head.getData().compareTo(node.getData()) >= 0){

                node.setNext(head);
                head.setPrev(node);
                head = node;
                cont++;

            }

            else if(tail.getData().compareTo(node.getData()) <= 0){

                node.setPrev(tail);
                tail.setNext(node);
                tail = node;
                cont++;

            }

            else {

                Node<T> aux = head;

                while (aux.getData().compareTo(node.getData()) <= 0){

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

    public void clear(){

        head = null;
        tail = null;
        cont = 0;

    }

    public boolean contains(T n){

        Node<T> aux = head;

        while (aux != null){

            if(aux.getData().equals(n)){

                return true;

            }

        }

        return false;

    }

    public void remove(T n){

        Node<T> aux = head;

        if(head.getData().equals(n)){

            head = head.getNext();
            try {
                head.setPrev(null);
            }
            catch (NullPointerException e){
                head = null;
                tail = null;
            }

        }

        else if(tail.getData().equals(n)){

            tail = tail.getPrev();

        }

        else {

            while(!aux.getData().equals(n)){

                aux = aux.getNext();

            }

            aux.getPrev().setNext(aux.getNext());

        }

        cont--;

    }

    public void remove(int i){

        if(i == 0){

            head = head.getNext();
            try {
                head.setPrev(null);
            }
            catch (NullPointerException e){
                head = null;
                tail = null;
            }
        }

        else if(i == cont){

            tail = tail.getPrev();

        }

        else {

            Node<T> aux = head;

            for(int j = 0; j < i; j++){

                aux = aux.getNext();

            }

            aux.getPrev().setNext(aux.getNext());

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

        while (aux != null){

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

        while(aux != null){

            string += aux.getData() + " ";

            aux = aux.getNext();

        }

        return string;

    }

    @Override
    public Iterator<T> iterator() {
        return new ListaIterator<T>(head);
    }
}
