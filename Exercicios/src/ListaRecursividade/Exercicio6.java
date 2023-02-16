package ListaRecursividade;

public class Exercicio6 {

    public static int f(int x, int n){

        if(n == 0){

            return 1;

        }

        else if(n >= 1){

            return x * f(x, n - 1);

        }

        else {

            return 1 / f(x, Math.abs(n));

        }

    }

    public static void main(String[] args) {

        System.out.println(f(2, -1));

    }

}
