package MultiploDe13;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int soma = 0;
        for(int i = Integer.min(n, m); i <= Integer.max(n, m); i++){
            if(i % 13 != 0){soma += i;
            }
        }
        System.out.println(soma);
    }

}
