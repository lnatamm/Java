package ListaRecursividade;

public class Exercicio1 {


    public static int Comb(int n, int k){

        if(k == 1){

            return n;

        }

        else if(k == n){

            return 1;

        }

        else if(1 < k && k < n){

            return Comb(n - 1, k - 1) + Comb(n - 1, k);

        }

        else return -1;

    }

    public static void main(String[] args) {

        System.out.println(Comb(5, 3));

    }

}
