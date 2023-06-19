package ColecaoDePomekons;

public class ListaEstatica <T>{

    private Object[] v;

    private int cont;

    public ListaEstatica(){
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

    public void remove(){
        cont--;
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
            if(v[i] == n){
                return i;
            }
        }
        return -1;
    }

}
