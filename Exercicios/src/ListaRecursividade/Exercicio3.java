package ListaRecursividade;

public class Exercicio3 {

    public static int F(int n){

        if(n < 4){

            return 3 * n;

        }

        else {

            return 2 * F(n - 4) + 5;

        }

    }

    public static void main(String[] args) {

        System.out.println(F(3) + " " + F(4));

    }

}
