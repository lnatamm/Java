package ColecaoDePomekons;

public class ListaEstatica <T>{

    private Object[] v;

    private int cont;

    public ListaEstatica(){

        this.v = new Object[10];

        this.cont = 0;

    }

    private void createEspace(){

        Object[] aux = this.v;

        this.v = new Object[cont + cont / 2];

        for(int i = 0; i < cont; i++){

            this.v[i] = aux[i];

        }

    }

    public void add(T n){

        try{

            this.v[cont] = n;

            this.cont++;

        }

        catch (IndexOutOfBoundsException e){

            createEspace();

            add(n);

        }

    }

    public void add(int i, T n){

        try{

            for(int j = cont; j > i; j--){

                this.v[j] = this.v[j - 1];

            }

            this.v[i] = n;

            this.cont++;

        }

        catch (IndexOutOfBoundsException e){

            createEspace();

            add(i, n);

        }

    }

    public int size(){

        return this.cont;

    }

    public void clear(){

        this.cont = 0;

    }

    public boolean contains(T n){

        for(int i = 0; i < this.cont; i ++){

            if(this.v[i].equals(n)){

                return true;

            }

        }

        return false;

    }

    public void remove(){

        this.cont--;

    }

    public void remove(int i){

        try {

            for (int j = i; j < this.cont; j++) {

                this.v[j] = this.v[j + 1];

            }

            this.cont--;

        }

        catch (ArrayIndexOutOfBoundsException e){

        }

    }

    public T get(int i){

        return (T)this.v[i];

    }

    public int indexOf(T n){

        for(int i = 0; i < this.cont; i ++){

            if(this.v[i] == n){

                return i;

            }

        }

        return -1;

    }

}
