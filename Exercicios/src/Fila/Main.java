package Fila;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila<String> fila = new Fila<String>();
        int n;
        n = Integer.parseInt(sc.next());
        for(int i = 0; i < n; i++){
            fila.enqueue(sc.next());
        }
        n = Integer.parseInt(sc.next());
        for(int i = 0; i < n; i++){
            fila.dequeue(sc.next());
        }
        for(String i : fila){
            System.out.print(i + " ");
        }
    }

}
