package ListaDinamica;

public class Main {

    public static void main(String[] args) {

        Lista<Integer> lista = new Lista<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.remove((Integer) 1);
        lista.remove((Integer) 2);
        lista.remove((Integer) 3);
        lista.remove((Integer) 4);
        
        for(Integer i : lista){

            System.out.print(i + " ");

        }

    }

}
