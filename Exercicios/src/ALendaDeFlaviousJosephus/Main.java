package ALendaDeFlaviousJosephus;

import java.util.Scanner;

public class Main {

    private static int m(int n, int m) {
        if (n == 1) {
            return 0;
        } else if (n >= 2) {
            return (m(n - 1, m) + m) % n;
        }
        return -1;
    }

    public static int p(int n, int m) {
        return m(n, m) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++) {
            System.out.println(String.format("Case %d: %d", i + 1, p(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()))));
        }
    }

}
