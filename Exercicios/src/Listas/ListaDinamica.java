package Listas;

public class ListaDinamica {

    private Node head;

    private Node tail;

    public ListaDinamica(){

        this.head = null;

        this.tail = null;

    }

    public void add(Object n){

        Node node = new Node(n);

        if(this.head == null){

            this.head = node;
            this.tail = node;

        }

        else{

            this.tail.setNext(node);
            this.tail = node;

        }

    }

    public void add(int i, Object n){

        Node node = new Node(n);

        Node aux = this.head;

        if(i == 0){

            if (this.head == null) {

                this.head = node;
                this.tail = node;

            } else {

                node.setNext(this.head);
                this.head = node;

            }

        }

        else{

            if (this.head == null) {

                throw new IndexOutOfBoundsException();

            }

            else {

                for(int j = 0; j < i; j++){

                    if(j == (i - 1)){

                        try {

                            node.setNext(aux.getNext());

                            aux.setNext(node);

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

        Node aux = this.head;

        int cont = 0;

        while (aux != null){

            cont++;

            aux = aux.getNext();

        }

        return cont;

    }

    public void clear(){

        this.head = null;
        this.tail = null;

    }

    public boolean contains(Object n){

        Node aux = this.tail;

        while(aux != null){

            if(aux.getData().equals(n)){

                return true;

            }

            aux = aux.getNext();

        }

        return false;

    }

    public void remove(Object n){

        Node aux = this.head;

        if(this.head.getData().equals(n)){

            this.head = this.head.getNext();

        }

        for(int i = 0; i < indexOf(n); i++){

            if(i == indexOf(n) - 1){

                aux.setNext(aux.getNext().getNext());

            }

            else {

                aux = aux.getNext();

            }

        }

    }

    public void remove(int i){

        Node aux = this.head;

        if(i == 0){

            if (this.head == null) {

                throw new NullPointerException();

            } else {

                this.head = this.head.getNext();

            }

        }

        else {

            for(int j = 0; j < i; j++){

                if(j == (i - 1)){

                    aux.setNext(aux.getNext().getNext());

                }

                else {

                    aux = aux.getNext();

                }

            }

        }

    }

    public Object get(int i){

        Node aux = this.head;

        for(int j = 0; j < i; j++){

            aux = aux.getNext();

        }

        return aux.getData();

    }

    public int indexOf(Object n){

        Node aux = this.head;

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

        Node aux = this.head;

        while(aux != null){

            System.out.print(aux.getData() + " ");

            aux = aux.getNext();

        }

        System.out.println();

    }

}
