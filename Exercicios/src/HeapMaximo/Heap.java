package HeapMaximo;

public class Heap<T extends Comparable<T>> {

    private T[] h;

    private int cont;

    public Heap(){
        h = (T[])new Object[10];
        cont = 0;
    }

    private void createEspace(){
        T[] aux = (T[])new Object[h.length];
        for(int i = 0; i < h.length; i++){
            aux[i] = h[i];
        }
        h = (T[])new Object[h.length + (h.length / 2)];
        for(int i = 0; i < aux.length; i++){
            h[i] = aux[i];
        }
    }
    
    public void enqueue(T data){
        if(h.length + 1 >= cont) {
            createEspace();
            enqueue(data);
        }
        h[cont] = data;
        cont++;
        subir(cont - 1);
    }

    public T dequeue(){
        T first = (T)h[0];
        if(cont > 0){
            cont--;
            h[0] = h[cont];
            descer(0);
        }
        return first;
    }

    private void subir(int i){
        T aux;
        if(i != 0){
            int pai = (i - 1) / 2;
            if(h[i].compareTo(h[pai]) > 0){
                aux = h[i];
                h[i] = h[pai];
                h[pai] = aux;
                subir(pai);
            }
        }
    }

    private void descer(int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int max;
        T aux;
        if(right >= cont){
            if(left >= cont){
                return;
            }
            else {
                max = left;
            }
        }
        else{
            if(h[left].compareTo(h[right]) >= 0){
                max = left;
            }
            else{
                max = right;
            }
        }
        if(h[i].compareTo(h[max]) < 0){
            aux = h[i];
            h[i] = h[max];
            h[max] = aux;
            descer(max);
        }
    }

    @Override
    public String toString(){
        String s = "[";
        for(int i = 0; i < cont - 1; i++){
            s += h[i] + ", ";
        }
        s += h[cont - 1] + "]";
        return s;
    }

}
