package Trilhos;

import FilaDinamica.Node;

import java.util.EmptyStackException;

public class Fila<T> {

    private NodeFila<T> first;

    private NodeFila<T> last;

    private int cont;

    public Fila(){
        first = null;
        last = null;
        cont++;
    }

    public int size(){
        return cont;
    }

    public void add(T data){
        NodeFila<T> node = new NodeFila(data);
        if(first == null){
            first = node;
            last = node;
        }
        else {
            node.setPrev(last);
            last.setNext(node);
            last = node;
        }
    }

    public T poll(){
        NodeFila<T> node;
        if(first == null){
            throw new EmptyStackException();
        }
        else {
            node = first;
            first = first.getNext();
            if(first == null){
                last = null;
            }
            cont--;
            return node.getData();
        }
    }

    public T peek(){
        if(first == null){
            throw new EmptyStackException();
        }
        else {
            return first.getData();
        }
    }

    public boolean isEmpty(){
        return last == null;
    }

    @Override
    public String toString(){
        String s = "[";
        NodeFila<T> curr = first;
        while (curr.getNext() != null){
            s += curr.getData() + " ";
            curr = curr.getNext();
        }
        return s + curr.getData() + "]";
    }

}
