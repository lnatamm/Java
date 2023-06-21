package ListaRecursividade;

public class Exercicio2 {

    private static int Max(int[] v, int n){
        if(n == v.length - 1){
            return v[n];
        }
        else if(v[n] > Max(v, n + 1)){
            return v[n];
        }
        else if(v[0] < Max(v, n + 1)){
            return Max(v, n + 1);
        }
        else {
            return -1;
        }
    }

    public static int Max(int[] v){
        return Max(v, 0);
    }

    public static void main(String[] args) {
        int[] v = new int[]{1, 2, 4, 7, 3, 9};
        System.out.println(Max(v));
    }

}
