package JogandoCartasFora;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n != 0) {
            Fila<Integer> baralho = new Fila<>();
            for (int i = 1; i <= n; i++) {
                baralho.enqueue(i);
            }
            System.out.print("Discarded cards: " + baralho.dequeue());
            while(baralho.size() >= 2){
                baralho.enqueue(baralho.dequeue());
                System.out.print(", " + baralho.dequeue());
            }
            System.out.println("\nRemaining card: " + baralho.peek());
            n = Integer.parseInt(sc.nextLine());
        }
    }

}
