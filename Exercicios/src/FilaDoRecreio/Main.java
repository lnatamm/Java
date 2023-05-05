package FilaDoRecreio;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        for(int i = 0; i < n; i++){

            Fila<Integer> filaOriginal = new Fila<>();

            FilaDePrioridade<Integer> filaApos = new FilaDePrioridade<>();

            int m = Integer.parseInt(sc.next());

            int iguais = 0;

            for(int j = 0; j < m; j++){

                filaOriginal.enqueue(Integer.parseInt(sc.next()));

            }

            for(Integer j : filaOriginal){

                filaApos.enqueue(j, j);

            }

            while (!filaApos.isEmpty()) {

                if (filaApos.dequeue().equals(filaOriginal.dequeue())) {
                    iguais++;
                }

            }

            System.out.println(iguais);

        }

    }

}
