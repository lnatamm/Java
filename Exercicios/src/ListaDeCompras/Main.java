package ListaDeCompras;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Lista<String> lista;

        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++){

            lista = new Lista<>();

            for(String j : sc.nextLine().split(" ")){

                lista.add(j);

            }

            System.out.println(lista);

        }

    }

}
