package VariasNotasComValidacao;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        int n = 1;

        while(n == 1){

            int notasValidas = 0;

            double nota1 = 0, nota2 = 0;

            while(notasValidas < 2){

                try{

                    if(notasValidas < 1){

                        nota1 = Double.parseDouble(dado.next());

                    }

                    if(nota1 < 0 || nota1 > 10){

                        throw new Exception("nota invalida");

                    }

                    if(nota1 >= 0 && nota1 <= 10 && notasValidas < 1){

                        notasValidas++;

                    }

                    nota2 = Double.parseDouble(dado.next());

                    if(nota2 < 0 || nota2 > 10){

                        throw new Exception("nota invalida");

                    }

                    else {

                        notasValidas++;

                        System.out.printf("media = %.2f\n", (nota1 + nota2) / 2);

                        System.out.println("novo calculo (1-sim 2-nao)");

                        n = Integer.parseInt(dado.next());

                        while(n != 1 && n != 2){

                            System.out.println("novo calculo (1-sim 2-nao)");

                            n = Integer.parseInt(dado.next());

                        }

                    }

                }

                catch (Exception e){

                    System.out.println(e.getMessage());

                }

            }

        }

    }

}
