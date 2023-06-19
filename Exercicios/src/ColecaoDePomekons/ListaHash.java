package ColecaoDePomekons;

public class ListaHash <T>{

    private Object[] v;

    private int cont;

    public ListaHash(){
        v = new Object[10];
        cont = 0;
    }

    private void createEspace(){
        Object[] aux = v;
        v = new Object[cont + cont / 2];
        for(int i = 0; i < cont; i++){
            v[i] = aux[i];
        }
    }

    public void add(T n){
        try{
            if(!contains(n)) {
                v[cont] = n;
                cont++;
            }
        }
        catch (IndexOutOfBoundsException e){
            createEspace();
            add(n);
        }
    }

    public int size() {
        return cont;
    }

    public void clear(){
        this.cont = 0;
    }

    public boolean contains(T n){
        for(int i = 0; i < cont; i ++){
            if(v[i].equals(n)){
                return true;
            }
        }
        return false;
    }

    private void remove(int i){
        try {
            for (int j = i; j < cont; j++) {
                v[j] = v[j + 1];
            }
            cont--;
        }
        catch (ArrayIndexOutOfBoundsException e){}
    }

    public void remove(T n){
        if(contains(n)){
            remove(indexOf(n));
        }
    }

    public T get(T n){
        return get(indexOf(n));
    }

    private T get(int i){
        return (T)v[i];
    }

    private int indexOf(T n){
        for(int i = 0; i < cont; i ++){
            if(v[i] == n){
                return i;
            }
        }
        return -1;
    }

}
