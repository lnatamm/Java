package Sequencia;

import java.util.*;

public class NumerosESoma {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        int m = 1;
        int n = 1;
        int soma = 0;

        while(m > 0 && n > 0){

            m = Integer.parseInt(sc.next());
            n = Integer.parseInt(sc.next());
            soma = 0;

            if(m > 0 && n > 0){

                for(int i = Integer.min(n, m); i <= Integer.max(n, m); i++){

                    System.out.print(i + " ");
                    soma += i;

                }

                System.out.println("Sum=" + soma);

            }

        }

    }

}
