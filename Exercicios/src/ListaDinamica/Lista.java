package ListaDinamica;

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

    public int size() {
        return cont;
    }


    public boolean isEmpty() {
        return head == null;
    }

    public boolean add(T t) {

        Node<T> node = new Node(t);

        if(head == null){

            head = node;
            tail = node;
            cont++;
            return true;

        }

        else{

            tail.setNext(node);
            tail = node;
            cont++;
            return true;

        }

    }

    public void add(int i, T n){

        Node<T> node = new Node(n);

        Node<T> aux = head;

        if(i == 0){

            if (head == null) {

                head = node;
                tail = node;
                cont++;

            } else {

                node.setNext(head);
                head = node;
                cont++;

            }

        }

        else if(i == cont){

            tail.setNext(node);
            tail = node;
            cont++;

        }

        else {

            if (head == null) {

                throw new IndexOutOfBoundsException();

            }

            else {

                for(int j = 0; j < i - 1; j++){

                    aux = aux.getNext();

                }

                try{

                    node.setNext(aux.getNext());
                    aux.setNext(node);
                    cont++;

                }

                catch (NullPointerException e){

                }

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

        while(aux != null){

            if(aux.getData().equals(n)){

                return true;

            }

            aux = aux.getNext();

        }

        return false;

    }

    public void remove(T n){

        Node<T> aux = head;

        if(head.getData().equals(n)){

            head = head.getNext();
            if(head == null){
                tail = null;
            }

        }

        else if(tail.getData().equals(n)){

            while (aux.getNext() != tail){

                aux = aux.getNext();

            }

            aux.setNext(null);
            tail = aux;

        }

        else {

            while (!aux.getNext().getData().equals(n)) {

                aux = aux.getNext();

            }

            aux.setNext(aux.getNext().getNext());

        }

        cont--;

    }

    public void remove(int i){

        Node<T> aux = head;

        if(i == 0){

            if (head == null) {

                throw new NullPointerException();

            } else {

                head = head.getNext();
                if(head == null){
                    tail = null;
                }

            }

        }

        else if(i == cont){

            while (aux.getNext() != tail){

                aux = aux.getNext();

            }

            tail = aux;

        }

        else {

            for(int j = 0; j < i; j++){

                if(j == (i - 1)){

                    aux.setNext(aux.getNext().getNext());

                }

                aux = aux.getNext();

            }

        }

        cont--;

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
