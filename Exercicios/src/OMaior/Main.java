package OMaior;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        
        a = Integer.parseInt(sc.next());
        b = Integer.parseInt(sc.next());
        c = Integer.parseInt(sc.next());

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        int maior = (maiorAB + c + Math.abs(maiorAB - c)) / 2;
        System.out.println(maior + " eh o maior");


    }

}
