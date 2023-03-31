package Trilhos;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tamanho = Integer.parseInt(sc.nextLine());

        Pilha<Integer> A;

        Pilha<Integer> estacao;

        Fila<Integer> B;

        while (tamanho != 0){

            A = new Pilha<>();

            estacao = new Pilha<>();

            B = new Fila<>();

            int aux = tamanho;

            for(int i = 0; i < tamanho; i++){

                A.push(aux);
                aux--;

            }

            int dadoLinha = Integer.parseInt(sc.next());

            if(dadoLinha != 0){

                B.add(dadoLinha);
                for(int i = 0; i < tamanho - 1; i++){

                    B.add(Integer.parseInt(sc.next()));

                }

                boolean controle = true;

                while (!B.isEmpty() && controle){

                    try {
                        if (estacao.peek().equals(B.peek())) {
                            estacao.pop();
                            B.poll();
                        }
                        else {
                            if(!A.isEmpty()) {
                                estacao.push(A.pop());
                            }
                            else {
                                controle = false;
                            }
                        }
                    }
                    catch (EmptyStackException e){

                        estacao.push(A.pop());

                    }

                }

                if(controle) {
                    System.out.println("Yes");
                }

                else {
                    System.out.println("No");
                }

            }

            else {

                tamanho = Integer.parseInt(sc.next());

                System.out.println();
                
            }

        }

    }

}
