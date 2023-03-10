package ListaDeCompras;

public class Lista<T extends Comparable<T>> {

    private Node<T> head;

    private Node<T> tail;

    private int cont;

    private Lista<T> duplicados;

    public Lista(){

        head = null;

        tail = null;

        cont = 0;

    }

    public void add(T n){

        if(!contains(n)) {

            Node<T> node = new Node<>(n);

            if (head == null) {

                head = node;
                tail = node;
                cont++;

            } else {

                if (head.getData().compareTo(node.getData()) >= 0) {

                    node.setNext(head);
                    head.setPrevious(node);
                    head = node;
                    cont++;

                } else if (tail.getData().compareTo(node.getData()) <= 0) {

                    node.setPrevious(tail);
                    tail.setNext(node);
                    tail = node;
                    cont++;

                } else {

                    Node<T> aux = head;

                    while (aux.getData().compareTo(node.getData()) <= 0) {

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

    }

    public int size(){

        return cont;

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

        Node<T> aux = head;

        if(head.getData().equals(n)){

            head = head.getNext();

        }

        else if(tail.getData().equals(n)){

            tail = tail.getPrevious();

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

        }

        else if(i == cont){

            tail = tail.getPrevious();

        }

        else {

            Node<T> aux = head;

            for(int j = 0; j < i; j++){

                aux = aux.getNext();

            }

            aux.getPrevious().setNext(aux.getNext());

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

        int cont = 0;

        while(aux != null){

            if(aux.getData().equals(n)){

                return cont;

            }

            aux = aux.getNext();
            cont++;

        }

        return -1;

    }

    public Lista<T> getDuplicados(){

        return duplicados;

    }

    @Override
    public String toString(){

        Node<T> aux = head;

        String string = "";

        while(aux.getNext() != null){

            string += aux.getData() + " ";

            aux = aux.getNext();

        }

        string += aux.getData();

        return string;

    }

}
