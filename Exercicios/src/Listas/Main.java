package Listas;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*ListaDinamicaOrdenadaCircular<Integer> lista = new ListaDinamicaOrdenadaCircular<>();

        lista.add(1);
        lista.add(7);
        lista.add(9);
        lista.add(2);
        lista.add(3);
        System.out.println(lista);*/

        /*
        ListaDinamicaCircular<Integer> lista = new ListaDinamicaCircular();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println(lista);
        */

        ListaDinamicaDuplamente<Integer> lista = new ListaDinamicaDuplamente<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(4, 5);
        System.out.println(lista);


        /*
        ListaDinamicaOrdenada<String> lista = new ListaDinamicaOrdenada<String>();

        lista.add("E");
        lista.add("D");
        lista.add("A");
        lista.add("F");
        lista.add("C");
        lista.add("B");
        lista.remove(0);
        System.out.println(lista.toString());
        lista.remove(4);
        System.out.println(lista.toString());
        lista.remove(2);
        System.out.println(lista.toString());
        */

        /*
        ListaDinamica lista = new ListaDinamica();

        lista.add("1");
        lista.add("4");
        lista.add("5");
        lista.add("7");
        System.out.println(lista);
        lista.add("6");
        System.out.println(lista);
        lista.add(5, "12");
        System.out.println(lista.contains("4"));
        System.out.println(lista);
        lista.remove(5);
        System.out.println(lista);
        System.out.println(lista.get(0));
        */


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
/*
        ListaEstatica<Integer> lista = new ListaEstatica();

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

        System.out.println(lista);

        lista.add(3, 10);

        System.out.println(lista);

        lista.remove(2);

        System.out.println(lista);

        lista.remove(5);

        System.out.println(lista);

        lista.remove((Integer)4);

        System.out.println(lista);

        System.out.println(lista.contains(10));

        System.out.println(lista.indexOf(10));

        System.out.println(lista.size());

        System.out.println(lista.get(1));

        lista.clear();

        System.out.println(lista);
*/
    }

}
