package ListaRecursividade;

public class Exercicio6 {

    public static double f(double x, double n){

        if(n == 0){

            return 1;

        }

        else if(n == 1){

            return x;

        }

        else if(n == 2){

            return x * x;

        }

        else if(n > 2){

            if(n % 2 == 0){

                return f(f(x, (n / 2)), 2);

            }

            else {

                return x * f(x, n - 1);

            }

        }

        else {

            return 1 / f(x, -n);

        }

    }

    public static void main(String[] args) {

        System.out.println(f(2, -3));

    }

}
