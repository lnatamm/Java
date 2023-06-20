package Figurinhas;

import java.util.Scanner;

public class Main {
    public static int mdc(int n1, int n2) {
        if (n1 % n2 == 0) {
            return n2;
        } else {
            return mdc(n2, n1 % n2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++) {
            int n1, n2;
            n1 = Integer.parseInt(sc.next());
            n2 = Integer.parseInt(sc.next());
            System.out.println(mdc(n1, n2));
        }
    }
}
