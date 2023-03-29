package BalancoDeParenteseI;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pilha<Character> parenteses;

        while (sc.hasNext()){

            String string = sc.nextLine();

            Lista<Character> lista = new Lista<>();

            boolean incorrect = false;

            parenteses = new Pilha<>();

            for(int i = 0; i < string.length(); i++){

                lista.add(string.charAt(i));

            }

            for(int i = 0; i < lista.size(); i++){

                if(lista.get(i).equals('(')){

                    parenteses.push('(');

                }

                try {

                    if (lista.get(i).equals(')')) {

                        parenteses.pop();

                    }

                }

                catch (EmptyStackException e){

                    incorrect = true;

                }

            }

            if(parenteses.isEmpty() && !incorrect){

                System.out.println("correct");

            }

            else {

                System.out.println("incorrect");

            }

        }

    }

}
