package ArvoreAVL;

public class Node <T extends Comparable<T>>{
    private T data;

    private Node<T> left;

    private Node<T> right;

    private int factor;

    public Node(T data){
        this.data = data;
        left = null;
        right = null;
        factor = 0;
    }

    public void incFactor(){
        factor++;
    }

    public void decFactor(){
        factor--;
    }

    public void incFactor(int i){
        factor += i;
    }

    public void decFactor(int i){
        factor -= i;
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

    public int getFactor(){
        return factor;
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

    public void setFactor(int factor){
        this.factor = factor;
    }

}
