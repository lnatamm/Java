package ListaEstatica;

import java.util.Iterator;

public class Lista<T> implements Iterable<T>{

    private T[] v;

    private int cont;

    public Lista(){
        v = (T[]) new Object[10];
        cont = 0;
    }

    private void createEspace(){
        Object[] auxV = this.v;
//        this.v = new Object[v.length + v.length / 2];
//        for(int i = 0; i < auxV.length; i++){
//            this.v[i] = auxV[i];
//        }
    }

    public void add(T n){
        try {
            v[cont] = n;
            cont++;
        }
        catch (IndexOutOfBoundsException e){
            createEspace();
            add(n);
        }
    }

    public void add(int i, T n){
        try{
            for(int j = cont; j > i; j--){
                v[j] = v[j - 1];
            }
            v[i] = n;
            cont++;
        }
        catch (IndexOutOfBoundsException e){
            createEspace();
            add(i, n);
        }
    }

    public int size(){
        return cont;
    }

    public void clear(){
        cont = 0;
    }

    public boolean contains(T n){
        for(int i = 0; i < cont; i ++){
            if(v[i].equals(n)){
                return true;
            }
        }
        return false;
    }

    public void remove(T n){
        try{
            for(int i = 0; i < cont; i++){
                if(v[i].equals(n)){
                    v[i] = v[i + 1];
                }
                cont--;
            }
        }
        catch (ArrayIndexOutOfBoundsException e){}
    }

    public void remove(int i){
        try {
            for (int j = i; j < cont; j++) {
                v[j] = v[j + 1];
            }
            cont--;
        }
        catch (ArrayIndexOutOfBoundsException e){}
    }

    public T get(int i){
        return (T)v[i];
    }

    public int indexOf(T n){
        for(int i = 0; i < cont; i ++){
            if(v[i].equals(n)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        String string = "";
        for(int i = 0; i < cont; i++){
            string += v[i] + " ";
        }
        return string;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListaIterator<T>((T[])v, cont);
    }
}
