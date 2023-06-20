package FibonacciQuantasChamadas;

import java.util.Scanner;

public class Main {
    private static int x;

    public static int fib(int n){
        x++;
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else if(n > 1){
            return fib(n - 1) + fib(n - 2);
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        for(int i = 0; i < n; i++){
            x = 0;
            int k = Integer.parseInt(sc.next());
            int r = fib(k);
            System.out.println(String.format("fib(%d) = %d calls = %d", k, x - 1, r));
        }
    }
}
