package Listas;

public class ListaEstatica {

    private Object[] v;

    private int cont;

    public ListaEstatica(){

        this.v = new Object[10];

        this.cont = 0;

    }

    private void createEspace(){

        Object[] auxV = this.v;

        this.v = new Object[v.length + v.length / 2];

        for(int i = 0; i < auxV.length; i++){

            this.v[i] = auxV[i];

        }

    }

    public void add(Object n){

        try {

            this.v[cont] = n;

            cont++;

        }

        catch (IndexOutOfBoundsException e){

            createEspace();

            this.v[cont] = n;

            this.cont++;

        }

    }

    public void add(int i, Object n){

        try{

            for(int j = cont; j > i; j--){

                this.v[j] = this.v[j - 1];

            }

            this.v[i] = n;

            this.cont++;

        }

        catch (IndexOutOfBoundsException e){

            createEspace();

            for(int j = this.cont; j > i; j--){

                this.v[j] = this.v[j - 1];

            }

            this.v[i] = n;

            this.cont++;

        }

    }

    public int size(){

        return this.cont;

    }

    public void clear(){

        this.cont = 0;

    }

    public boolean contains(Object n){

        for(int i = 0; i < this.cont; i ++){

            if(this.v[i] == n){

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

    public Object get(int i){

        return this.v[i];

    }

    public int indexOf(Object n){

        for(int i = 0; i < this.cont; i ++){

            if(this.v[i] == n){

                return i;

            }

        }

        return -1;

    }

    public void show(){

        for(int i = 0; i < this.cont; i++){

            System.out.print(this.v[i] + " ");

        }

        System.out.println();

    }


}
