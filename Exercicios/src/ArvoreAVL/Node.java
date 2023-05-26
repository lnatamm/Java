package ArvoreAVL;

public class Node <T extends Comparable<T>>{
    private T data;

    private Node<T> left;

    private Node<T> right;

    private int fator;

    public Node(T data){
        this.data = data;
        left = null;
        right = null;
        fator = 0;
    }

    public void incFator(){
        fator++;
    }

    public void decFator(){
        fator--;
    }

    public T getData(){
        return data;
    }

    public Node<T> getLeft(){
        return left;
    }

    public Node<T> getRight(){
        return right;
    }

    public int getFator(){
        return fator;
    }

    public void setData(T data){
        this.data = data;
    }

    public void setLeft(Node<T> left){
        this.left = left;
    }

    public void setRight(Node<T> right){
        this.right = right;
    }

    public void setFator(int fator){
        this.fator = fator;
    }

}
