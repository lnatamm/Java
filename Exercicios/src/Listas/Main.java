package Listas;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ListaEstatica lista = new ListaEstatica();

        lista.add(1);
        lista.add(2);
        lista.add(7);
        lista.add(4);
        lista.add("Teste");
        lista.add("op");
        lista.add(false);

        lista.show();

        lista.add(3, "Adicionando");

        lista.show();

        lista.remove(2);

        lista.show();

        lista.remove(5);

        lista.show();

        lista.remove();

        lista.show();

        System.out.println(lista.contains("Teste"));

        System.out.println(lista.indexOf("Teste"));

        System.out.println(lista.size());

        System.out.println(lista.get(1));

        lista.clear();

        lista.show();

    }

}
