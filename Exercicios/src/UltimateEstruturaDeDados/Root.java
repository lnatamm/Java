package UltimateEstruturaDeDados;

public class Root <T extends Comparable<T>>{
    private T data;

    private Root<T> left;

    private Root<T> right;

    private int factor;

    public Root(T data){
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

    public T getData(){
        return data;
    }

    public Root<T> getLeft(){
        return left;
    }

    public Root<T> getRight(){
        return right;
    }

    public int getFactor(){
        return factor;
    }

    public void setData(T data){
        this.data = data;
    }

    public void setLeft(Root<T> left){
        this.left = left;
    }

    public void setRight(Root<T> right){
        this.right = right;
    }

    public void setFactor(int factor){
        this.factor = factor;
    }
}
