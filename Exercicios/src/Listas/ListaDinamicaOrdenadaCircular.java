package Listas;

public class ListaDinamicaOrdenadaCircular<T extends Comparable<T>> {

    private DoubleNode<T> head;

    private DoubleNode<T> tail;

    private int cont;

    public ListaDinamicaOrdenadaCircular(){

        head = null;
        tail = null;

    }

    public void add(T n){

        DoubleNode<T> node = new DoubleNode<>(n);

        if(head == null){

            head = node;
            tail = node;
            cont++;

        }

        else {

            if(head.getData().compareTo(node.getData()) >= 0){

                node.setNext(head);
                head.setPrevious(node);
                head = node;
                head.setPrevious(tail);
                tail.setNext(head);
                cont++;

            }

            else if(tail.getData().compareTo(node.getData()) <= 0){

                node.setPrevious(tail);
                tail.setNext(node);
                tail = node;
                tail.setNext(head);
                head.setPrevious(tail);
                cont++;

            }

            else {

                DoubleNode<T> aux = head;

                while (aux.getData().compareTo(node.getData()) <= 0){

                    aux = aux.getNext();

                }

                aux.getPrevious().setNext(node);
                node.setPrevious(aux.getPrevious());
                node.setNext(aux);
                aux.setPrevious(node);
                cont++;

            }

        }


    }

    public int size(){

        return cont;

    }

    public void remove(T n){

        DoubleNode<T> aux = head;

        if(head.getData().equals(n)){

            head = head.getNext();
            head.setPrevious(tail);
            tail.setNext(head);

        }

        else if(tail.getData().equals(n)){

            tail = tail.getPrevious();
            tail.setNext(head);
            head.setPrevious(tail);

        }

        else {

            while(!aux.getData().equals(n)){

                aux = aux.getNext();

            }

            aux.getPrevious().setNext(aux.getNext());

        }

    }

    public void remove(int i){

        if(i == 0){

            head = head.getNext();
            head.setPrevious(tail);
            tail.setNext(head);

        }

        else if(i == cont){

            tail = tail.getPrevious();
            tail.setNext(head);
            head.setPrevious(tail);

        }

        else {

            DoubleNode<T> aux = head;

            for(int j = 0; j < i; j++){

                aux = aux.getNext();

            }

            aux.getPrevious().setNext(aux.getNext());

        }

    }

    public void clear(){

        head = null;
        tail = null;
        cont = 0;

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

        for(int i = 0; i < cont; i++){

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

        for(int i = 0; i < cont; i++){

            if(aux.getData().equals(n)){

                return cnt;

            }

            cnt++;

        }

        return -1;

    }

    @Override
    public String toString(){

        DoubleNode<T> aux = head;

        String string = "";

        for(int i = 0; i < cont; i++){

            string += aux.getData() + " ";

            aux = aux.getNext();

        }

        return string;

    }

}
