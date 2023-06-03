package UltimateEstruturaDeDados;

import java.util.Iterator;

public class List<T> implements Iterable<T>{

    private Node<T> head;

    private Node<T> tail;

    private int cont;

    private class iterator<T> implements Iterator<T>{
        private Node<T> curr;

        private int atual;

        private int fim;

        public iterator(Node<T> head, int cont){
            curr = head;
            atual = 0;
            fim = cont;
        }

        @Override
        public boolean hasNext() {
            return atual != fim;
        }

        @Override
        public T next() {
            T data = curr.getData();
            curr = curr.getNext();
            atual++;
            return data;
        }
    }

    public List(){
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

    public void add(T data){
        Node<T> node = new Node<>(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
            tail.setNext(head);
            head.setPrev(tail);
        }
        cont++;
    }

    public void add(int i, T data){
        Node<T> node = new Node(data);
        if(i == 0){
            node.setNext(head);
            head.setPrev(node);
            head = node;
            head.setPrev(tail);
            tail.setNext(head);
        }
        else if(i == cont){
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
            tail.setNext(head);
            head.setPrev(tail);
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
        }
        cont++;
    }

    public void clear(){
        head = null;
        tail = null;
        cont = 0;
    }

    public boolean contains(T data){
        Node<T> aux = head;
        for(int i = 0; i < cont; i++){
            if(aux.getData().equals(data)){
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    public void remove(T data){
        if(head.getData().equals(data)){
            if(!head.equals(tail)) {
                head = head.getNext();
                head.setPrev(tail);
                tail.setNext(head);
            }
            else {
                head = null;
                tail = null;
            }
        }
        else if(tail.getData().equals(data)){
            tail = tail.getPrev();
            tail.setNext(head);
            head.setPrev(tail);
        }
        else {
            Node<T> aux = head;
            while (!aux.getData().equals(data)){
                aux = aux.getNext();
            }
            aux.getPrev().setNext(aux.getNext());
        }
        cont--;
    }

    public void remove(int i){
        if(i == 0){
            if(!head.equals(tail)) {
                head = head.getNext();
                head.setPrev(tail);
                tail.setNext(head);
            }
            else {
                head = null;
                tail = null;
            }
        }
        else if(i == cont - 1) {
            tail = tail.getPrev();
            tail.setNext(head);
            head.setPrev(tail);
        }
        else {
            Node<T> aux = head;
            for(int j = 0; j < i; j++){
                aux = aux.getNext();
            }
            aux.getPrev().setNext(aux.getNext());
        }
        cont--;
    }

    public T dequeue(){
        Node<T> node = head;
        if(!head.equals(tail)) {
            head = head.getNext();
            head.setPrev(tail);
            tail.setNext(head);
        }
        else {
            head = null;
            tail = null;
        }
        cont--;
        return node.getData();
    }

    public T pop(){
        Node<T> node = tail;
        tail = tail.getPrev();
        tail.setNext(head);
        head.setPrev(tail);
        cont--;
        return node.getData();
    }

    public T get(int i){
        Node<T> aux = head;
        for(int j = 0; j < i; j++){
            aux = aux.getNext();
        }
        return aux.getData();
    }

    public T peek(){
        return head.getData();
    }

    public int indexOf(T data){
        Node<T> aux = head;
        int cnt = 0;
        for(int i = 0; i < cont; i++){
            if(aux.getData().equals(data)){
                return cnt;
            }
            cont++;
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
        return new iterator<T>(head, cont);
    }

}