package ListaDinamicaDuplamenteEncadeada;

public class Main {

    public static void main(String[] args) {
        Lista<Integer> lista = new Lista<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.remove(0);
        lista.remove(0);
        lista.remove(0);
        lista.remove(0);
        for (Integer i: lista) {
            System.out.println(i);
        }
    }

}
