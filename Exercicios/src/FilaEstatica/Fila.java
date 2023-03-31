package FilaEstatica;

public class Fila<T> {
    
    private Object[] v;

    private int end;

    private int start;

    private int cont;

    public Fila(){

        v = (T[])new Object[10];
        end = -1;
        start = 0;
        cont = 0;

    }

    private void createEspace(){

        Object[] aux = v;
        v = (T[])new Object[v.length + (v.length / 2)];
        if(end > start){
            for(int i = start; i <= end; i++){

                v[i] = aux[i];

            }
        }
        else{

            int j = 0;

            for(int i = start; i < aux.length; i++){

                v[j] = aux[i];
                j++;

            }

            for(int i = 0; i <= end; i++){

                v[j] = aux[i];
                j++;

            }

        }

        start = 0;
        end = aux.length - 1;

    }

    public int size(){

        return cont;

    }

    public void enqueue(T data){
        if(end + 1 == v.length){
            if(start != 0){
                end = 0;
                v[end] = data;
                cont++;
            }
            else{
                createEspace();
                enqueue(data);
            }
            
        }
        else if(end == -1){

            end++;
            v[end] = data;
            cont++;

        }
        else{
            if(end + 1 != start && end + 1 != v.length){
                end++;
                v[end] = data;
                cont++;
            }
            else{
                createEspace();
                enqueue(data);
            }
        }
    }

    public T dequeue(){

        T aux = (T)v[start];

        if(end > start){

            if(start != end){

                start++;
                cont--;

            }

            else{

                start = 0;
                end = -1;
                cont = 0;
                return null;

            }

        }

        else if(end < start){

            if(start + 1 == v.length){
                
                start = 0;
                cont--;

            }

            else{

                start++;
                cont--;

            }

        }

        else{

            start = 0;
            end = -1;
            cont = 0;
            return null;

        }

        System.out.println();

        return aux;

    }

    @Override
    public String toString(){

        String s = "";

        if(end != -1) {

            if (end > start) {

                for (int i = start; i <= end; i++) {

                    s += v[i] + " ";

                }

            }

            else if(end < start){

                for (int i = start; i < v.length; i++) {

                    s += v[i] + " ";

                }

                for (int i = 0; i <= end; i++) {

                    s += v[i] + " ";

                }

            }

            else {

                s += v[start];

            }

        }

        return s;

    }

}
