package ListaRecursividade;

public class Exercicio7 {

    public static void perm(String p, String s){
        if(s.length() == 1){
            System.out.print(p + " ");
        }
        else {
            for (int i = 0; i < s.length(); i++) {
                perm(p + s.charAt(i), s.substring(0, i) + s.substring(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        perm("", "ABCD");
    }

}
