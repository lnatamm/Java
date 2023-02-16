package ListaRecursividade;

public class Exercicio4 {

    public static double RaizQ(double x, double x0, double ε){

        if(Math.abs((x0 * x0) - x) <= ε){

            return x0;

        }

        else{

            return RaizQ(x, (((x0 * x0) + x) / (2 * x0)), ε);

        }

    }

    public static void main(String[] args) {

        System.out.println(RaizQ(13, 3.2, 0.001));

    }

}
