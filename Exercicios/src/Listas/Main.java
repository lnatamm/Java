package Listas;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ListaDinamica lista = new ListaDinamica();

        lista.add("1");
        lista.add("4");
        lista.add("5");
        lista.add("7");
        lista.show();
        lista.add("6");
        lista.show();
        lista.remove("6");
        lista.show();
        lista.remove(3);
        lista.show();
        System.out.println(lista.get(0));

        /*Scanner sc = new Scanner(System.in);

        ListaEstatica lista = new ListaEstatica();

        for(int i = 1; i <= 31; i++){

            lista.add(i + " de janeiro");

        }

        for(int i = 1; i <= 30; i++){

            lista.add(i + " de fevereiro");

        }

        for(int i = 1; i <= 31; i++){

            lista.add(i + " de março");

        }

        for(int i = 1; i <= 30; i++){

            lista.add(i + " de abril");

        }


        for(int i = 1; i <= 31; i++){

            lista.add(i + " de maio");

        }

        for(int i = 1; i <= 30; i++){

            lista.add(i + " de junho");

        }

        for(int i = 1; i <= 31; i++){

            lista.add(i + " de julho");

        }


        for(int i = 1; i <= 31; i++){

            lista.add(i + " de agosto");

        }

        for(int i = 1; i <= 30; i++){

            lista.add(i + " de setembro");

        }

        for(int i = 1; i <= 31; i++){

            lista.add(i + " de outubro");

        }

        for(int i = 1; i <= 30; i++){

            lista.add(i + " de novembro");

        }

        for(int i = 1; i <= 31; i++){

            lista.add(i + " de dezembro");

        }

        Random random = new Random();

        int n = 1;

        while(n == 1){

            int x = Integer.parseInt(sc.next());

            for(int i = 0; i < x; i ++){

                lista.remove(random.nextInt(lista.size()));

            }

            lista.show();

            n = Integer.parseInt(sc.next());

        }*/

        /*ListaEstatica lista = new ListaEstatica();

        lista.add(1);
        lista.add(2);
        lista.add(7);
        lista.add(4);
        lista.add("Teste");
        lista.add("op");
        lista.add(false);
        lista.add(1);
        lista.add(2);
        lista.add(7);
        lista.add(4);

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

        lista.show();*/

    }

}
