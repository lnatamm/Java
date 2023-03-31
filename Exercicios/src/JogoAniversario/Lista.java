package JogoAniversario;

public class Lista<T> {

    private Object[] v;

    private int cont;

    public Lista(){

        this.v = (T[]) new Object[10];

        this.cont = 0;

    }

    private void createEspace(){

        Object[] auxV = this.v;

        this.v = new Object[v.length + v.length / 2];

        for(int i = 0; i < auxV.length; i++){

            this.v[i] = auxV[i];

        }

    }

    public void add(T n){

        try {

            this.v[cont] = n;

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

    public void remove(T n){

        try{

            for(int i = 0; i < cont; i++){

                if(v[i].equals(n)){

                    v[i] = v[i + 1];

                }

                cont--;

            }

        }

        catch (ArrayIndexOutOfBoundsException e){

        }

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

            if(this.v[i].equals(n)){

                return i;

            }

        }

        return -1;

    }

    @Override
    public String toString(){

        String string = "";

        for(int i = 0; i < this.cont; i++){

            string += v[i] + " ";

        }

        return string;

    }

}
