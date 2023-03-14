package SomaDeImparesConsecutivosII;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        for(int i = 0; i < n; i++){

            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int soma = 0;

            for(int j = Integer.min(a, b) + 1; j < Integer.max(a, b); j++){

                if(j % 2 != 0){
                    soma+=j;
                }

            }

            System.out.println(soma);

        }

    }

}
