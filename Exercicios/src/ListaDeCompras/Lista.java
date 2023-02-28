package ListaDeCompras;

public class Lista {

    private Node head;

    private Node tail;

    public Lista(){

        this.head = null;

        this.tail = null;

    }

    public void add(String s){

        Node node = new Node(s);

        if(this.head == null){

            this.head = node;
            this.tail = node;

        }

        else {

            this.tail.setNext(node);
            this.tail = node;

        }

    }

    public void add(int i, String s){

        Node node = new Node(s);

        Node aux = this.head;

        if(i == 0){

            if(this.head == null){

                this.head = node;
                this.tail = node;

            }

            else {

                node.setNext(this.head);
                this.head = node;

            }

        }

        else {

            if(this.head == null){

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

                    else {

                        aux = aux.getNext();

                    }

                }

            }

        }

    }

    public int size(){

        int cont = 0;

        Node aux = this.head;

        while(aux != null){

            cont++;

            aux = aux.getNext();

        }

        return cont;

    }

    public void clear(){

        this.head = null;
        this.tail = null;

    }

    public boolean contains(String s){

        Node aux = this.head;

        while (aux != null){

            if(aux.getData().equals(s)){

                return true;

            }

            aux = aux.getNext();

        }

        return false;

    }

    public void remove(String s){

        Node aux = this.head;

        while (aux.getNext() != null){

            if(aux.getNext().getData().equals(s)){

                aux.setNext(aux.getNext().getNext());

                break;

            }

            aux = aux.getNext();

        }

    }

    public void remove(int i){

        Node aux = this.head;

        if(i == 0){

            try {

                this.head = this.head.getNext();

            }

            catch (NullPointerException e){

            }

        }

        for(int j = 0; j < i; j++){

            if(j == (i - 1)){

                aux.setNext(aux.getNext().getNext());

            }

            aux = aux.getNext();

        }

    }

    public String get(int i){

        Node aux = this.head;

        for(int j = 0; j < i; j++){

            aux = aux.getNext();

        }

        return aux.getData();

    }

    public int indexOf(String s){

        Node aux = this.head;

        int cont = 0;

        while(aux != null){

            if(aux.getData().equals(s)){

                return cont;

            }

            aux = aux.getNext();

            cont++;

        }

        return -1;

    }

    public void sort(){


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
