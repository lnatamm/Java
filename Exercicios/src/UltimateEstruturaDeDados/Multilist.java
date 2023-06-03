package UltimateEstruturaDeDados;

public class Multilist<T extends Comparable<T>> {

    private List<T> list;

    private Hash<T> hash;

    private Tree<T> tree;

    private int size;

    public Multilist(){
        list = new List<T>();
        hash = new Hash<T>();
        tree = new Tree<T>();
        size = 0;
    }

    public void add(T data){
        list.add(data);
        hash.add(data);
        tree.add(data);
        size++;
    }

    public void add(int i, T data){
        list.add(i, data);
        hash.add(data);
        tree.add(data);
        size++;
    }

    public void push(T data){
        list.add(data);
        hash.add(data);
        tree.add(data);
        size++;
    }

    public void enqueue(T data){
        list.add(data);
        hash.add(data);
        tree.add(data);
        size++;
    }

    public void remove(T data){
        list.remove(data);
        hash.remove(data);
        tree.remove(data);
        size--;
    }

    public void remove(int i){
        T data = list.get(i);
        list.remove(i);
        hash.remove(data);
        tree.remove(data);
        size--;
    }

    public T pop(){
        T data = list.pop();
        hash.remove(data);
        tree.remove(data);
        size--;
        return data;
    }

    public T dequeue(){
        T data = list.dequeue();
        hash.remove(data);
        tree.remove(data);
        size--;
        return data;
    }

    public boolean search(T data){
        return tree.search(data);
    }

    public boolean contains(T data){
        return hash.contains(data);
    }

    public T max(){
        return tree.max();
    }

    public T min(){
        return tree.min();
    }

    public String preOrder(){
        return tree.preOrdem();
    }

    public String inOrder(){
        return tree.emOrdem();
    }

    public String postOrder(){
        return tree.posOrdem();
    }

    @Override
    public String toString(){
        return tree.toString();
    }

}
