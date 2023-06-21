package ListaDeNomes;


public class ListaLista {

    private ListaString[] v;

    private int cnt;

    public ListaLista(){
        v = new ListaString[10];
        cnt = 0;
    }

    private void createEspace(){
        ListaString[] aux = v;
        v = new ListaString[v.length + v.length / 2];
        for(int i = 0; i < aux.length; i++){
            v[i] = aux[i];
        }
    }

    public void add(ListaString l){
        try{
            v[cnt] = l;
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
                v[j] = v[j - 1];
            }
            v[i] = l;
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
        cnt = 0;
    }
    public boolean contains(ListaString l){
        for(int i = 0; i < cnt; i ++){
            if(v[i].equals(l)){
                return true;
            }
        }
        return false;
    }

    public void remove(int i){
        try {
            for (int j = i; j < cnt; j++) {
                v[j] = v[j + 1];
            }
            cnt--;
        }
        catch (ArrayIndexOutOfBoundsException e){}
    }

    public ListaString get(int i){
        return v[i];
    }

    public int indexOf(ListaString l){
        for(int i = 0; i < cnt; i ++){
            if(v[i].equals(l)){
                return i;
            }
        }
        return -1;
    }

}
