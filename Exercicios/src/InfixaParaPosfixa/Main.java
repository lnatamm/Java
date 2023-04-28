package InfixaParaPosfixa;

import java.util.EmptyStackException;
import java.util.Scanner;

import PilhaDinamica.Pilha;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < n; i++){

            String infixa = sc.nextLine();

            String posfixa = "";

            Pilha<Character> operadores = new Pilha<>();

            for(int j = 0; j < infixa.length(); j++){

                if(Character.isLetterOrDigit(infixa.charAt(j))){

                    posfixa += infixa.charAt(j);

                }

                else{

                    try{

                        if(operadores.peek().equals("^")){

                            posfixa += operadores.pop();

                        }

                        else if(operadores.peek().equals("*") || operadores.peek().equals("/")){

                        }

                        else{

                        }

                    }

                    catch(EmptyStackException e){

                    }

                }

            }

        }

    }

}
