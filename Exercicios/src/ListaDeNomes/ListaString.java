package ListaDeNomes;

public class ListaString {

    private String[] v;

    private int[] tamanhos;

    private int cnt;

    public ListaString(){

        this.v = new String[10];

        this.tamanhos = new int[10];

        this.cnt = 0;

    }

    private void createEspace(){

        String[] aux = this.v;

        this.v = new String[this.v.length + this.v.length / 2];

        for(int i = 0; i < aux.length; i++){

            this.v[i] = aux[i];

        }

        int[] auxTamanhos = this.tamanhos;

        this.tamanhos = new int[this.tamanhos.length + this.tamanhos.length / 2];

        for(int i = 0; i < auxTamanhos.length; i++){

            this.tamanhos[i] = auxTamanhos[i];

        }

    }

    public void add(String s){

        try{

            this.v[cnt] = s;

            this.tamanhos[cnt] = s.length();

            cnt++;

        }

        catch (IndexOutOfBoundsException e){

            createEspace();

            add(s);

        }

    }

    public void add(int i, String s){

        try{

            for(int j = cnt; j > i; j--){

                this.v[j] = this.v[j - 1];
                this.tamanhos[j] = this.tamanhos[j - 1];

            }

            this.v[i] = s;
            this.tamanhos[i] = s.length();

            cnt++;

        }

        catch (IndexOutOfBoundsException e){

            createEspace();

            add(i, s);

        }

    }

    public int size(){

        return cnt;

    }

    public void clear(){

        this.cnt = 0;

    }

    public boolean contains(String s){

        for(int i = 0; i < this.cnt; i ++){

            if(this.v[i].equals(s)){

                return true;

            }

        }

        return false;

    }

    public boolean contains(int i){

        for(int j = 0; j < this.cnt; j++){

            if(this.tamanhos[j] == i){

                return true;

            }

        }

        return false;

    }

    public void remove(int i){

        try {

            for (int j = i; j < this.cnt; j++) {

                this.v[j] = this.v[j + 1];
                this.tamanhos[j] = this.v[j + 1].length();

            }

            this.cnt--;

        }

        catch (ArrayIndexOutOfBoundsException e){

        }

    }

    public String get(int i){

        return this.v[i];

    }

    public int indexOf(String s){

        for(int i = 0; i < this.cnt; i ++){

            if(this.v[i].equals(s)){

                return i;

            }

        }

        return -1;

    }

    public void sort(){

        String aux;

        for(int i = 0; i < this.cnt; i++){

            for(int j = 0; j < this.cnt - 1; j++){

                if(this.v[j].length() > this.v[j + 1].length()){

                    aux = this.v[j];
                    this.v[j] = this.v[j + 1];
                    this.v[j + 1] = aux;

                }

            }

        }

    }

    public void show(){

        for(int i = 0; i < this.cnt; i++){

            if(i + 1 == this.cnt) {

                System.out.print(this.v[i]);

            }

            else {

                System.out.print(this.v[i] + ", ");

            }

        }

        System.out.println();

    }

}
