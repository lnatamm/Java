package ListaDeNomes;

public class ListaString {

    private String[] v;

    private int[] tamanhos;

    private int cnt;

    public ListaString(){
        v = new String[10];
        tamanhos = new int[10];
        cnt = 0;
    }

    private void createEspace(){
        String[] aux = v;
        v = new String[v.length + v.length / 2];
        for(int i = 0; i < aux.length; i++){
            v[i] = aux[i];
        }
        int[] auxTamanhos = tamanhos;
        tamanhos = new int[tamanhos.length + tamanhos.length / 2];
        for(int i = 0; i < auxTamanhos.length; i++){
            tamanhos[i] = auxTamanhos[i];
        }
    }

    public void add(String s){
        try{
            v[cnt] = s;
            tamanhos[cnt] = s.length();
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
                v[j] = v[j - 1];
                tamanhos[j] = tamanhos[j - 1];
            }
            v[i] = s;
            tamanhos[i] = s.length();
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
        cnt = 0;
    }

    public boolean contains(String s){
        for(int i = 0; i < cnt; i ++){
            if(v[i].equals(s)){
                return true;
            }
        }
        return false;
    }

    public boolean contains(int i){
        for(int j = 0; j < cnt; j++){
            if(tamanhos[j] == i) {
                return true;
            }
        }
        return false;
    }

    public void remove(int i){
        try {
            for (int j = i; j < cnt; j++) {
                v[j] = v[j + 1];
                tamanhos[j] = v[j + 1].length();
            }
            cnt--;
        }
        catch (ArrayIndexOutOfBoundsException e){}
    }

    public String get(int i){
        return v[i];
    }

    public int indexOf(String s){
        for(int i = 0; i < cnt; i ++){
            if(v[i].equals(s)){
                return i;
            }
        }
        return -1;
    }

    public void sort(){
        String aux;
        for(int i = 0; i < cnt; i++){
            for(int j = 0; j < cnt - 1; j++){
                if(v[j].length() > v[j + 1].length()){
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }

    public void show(){
        for(int i = 0; i < cnt; i++) {
            if (i + 1 == cnt) {
                System.out.print(v[i]);
            } else {
                System.out.print(v[i] + ", ");
            }
        }
        System.out.println();
    }

}
