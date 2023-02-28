package ListaDeCompras;

public class Main {

    public static void main(String[] args) {

        Lista l = new Lista();

        l.add("Morango");
        l.add("Abacaxi");
        l.add("Cenoura");
        l.add("Banana");
        l.sort();
        l.show();

    }

}
