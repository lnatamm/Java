package ListaDeNomes;


public class ListaLista {

    private ListaString[] v;

    private int cnt;

    public ListaLista(){

        this.v = new ListaString[10];

        this.cnt = 0;

    }

    private void createEspace(){

        ListaString[] aux = this.v;

        this.v = new ListaString[this.v.length + this.v.length / 2];

        for(int i = 0; i < aux.length; i++){

            this.v[i] = aux[i];

        }

    }

    public void add(ListaString l){

        try{

            this.v[cnt] = l;

            cnt++;

        }

        catch (IndexOutOfBoundsException e){

            createEspace();

            add(l);

        }

    }

    public void add(int i, ListaString l){

        try{

            for(int j = cnt; j > i; j--){

                this.v[j] = this.v[j - 1];

            }

            this.v[i] = l;

            cnt++;

        }

        catch (IndexOutOfBoundsException e){

            createEspace();

            add(i, l);

        }

    }

    public int size(){

        return cnt;

    }

    public void clear(){

        this.cnt = 0;

    }

    public boolean contains(ListaString l){

        for(int i = 0; i < this.cnt; i ++){

            if(this.v[i].equals(l)){

                return true;

            }

        }

        return false;

    }

    public void remove(int i){

        try {

            for (int j = i; j < this.cnt; j++) {

                this.v[j] = this.v[j + 1];

            }

            this.cnt--;

        }

        catch (ArrayIndexOutOfBoundsException e){

        }

    }

    public ListaString get(int i){

        return this.v[i];

    }

    public int indexOf(ListaString l){

        for(int i = 0; i < this.cnt; i ++){

            if(this.v[i].equals(l)){

                return i;

            }

        }

        return -1;

    }

}
