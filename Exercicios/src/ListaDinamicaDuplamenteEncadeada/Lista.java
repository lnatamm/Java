package ListaDinamicaDuplamenteEncadeada;

public class Lista<T> {

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

        if(tail == null){

            head = node;
            tail = node;
            cont++;

        }

        else {

            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
            cont++;

        }

    }

    public void add(int i, T n){

        Node<T> node = new Node(n);

        if(i == 0){

            head.setPrev(node);
            node.setNext(head);
            head = node;
            cont++;

        }

        else if(i == cont){

            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
            cont++;

        }

        else {

            Node<T> aux = head;

            for(int j = 0; j < i; j++){

                aux = aux.getNext();

            }

            aux.getPrev().setNext(node);
            node.setPrev(aux.getPrev());
            aux.setPrev(node);
            node.setNext(aux);
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

        while (aux != null){

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

        }

        else if(tail.getData().equals(n)){

            tail = tail.getPrev();

        }

        else {

            Node<T> aux = head;

            while (!aux.getData().equals(n)){

                aux = aux.getNext();

            }

            aux.getPrev().setNext(aux.getNext());

        }

    }

    public void remove(int i){

        if(i == 0){

            head = head.getNext();

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

            cnt++;

        }

        return - 1;

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

}
