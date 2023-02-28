package ListaDeNomes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaLista listaLista = new ListaLista();

        listaLista.add(new ListaString());

        int n = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < n; i++){

            String nome = sc.nextLine();

            boolean contem = true;

            int aux = 0;

            for(int j = 0; j < listaLista.size(); j++){

                if(!listaLista.get(j).contains(nome.length()) && contem){

                    listaLista.get(j).add(nome);

                    contem = false;

                }

                aux = j + 1;

            }

            if(contem){

                listaLista.add(new ListaString());
                listaLista.get(aux).add(nome);

            }

        }

        for(int i = 0; i < listaLista.size(); i++){

            listaLista.get(i).sort();

            listaLista.get(i).show();

        }

    }

}
