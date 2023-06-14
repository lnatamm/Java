package OperacoesEmABPII;

import java.util.Scanner;

public class Main {
    public static String removeLastChar(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, str.length() - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree<Integer> tree = new Tree<>();
        String comando = "";
        while (!comando.equals("Parar")){
            comando = sc.next();
            if(comando.equals("I")){
                tree.add(Integer.parseInt(sc.next()));
            }
            if(comando.equals("INFIXA")){
                String s = tree.emOrdem();
                System.out.println(removeLastChar(s));
            }
            if(comando.equals("PREFIXA")){
                String s = tree.preOrdem();
                System.out.println(removeLastChar(s));
            }
            if(comando.equals("POSFIXA")){
                String s = tree.posOrdem();
                System.out.println(removeLastChar(s));
            }
            if(comando.equals("P")){
                int n = Integer.parseInt(sc.next());
                System.out.print(n);
                if(!tree.search(n)){
                    System.out.print(" nao");
                }
                System.out.println(" existe");
            }
            if (comando.equals("R")){
                tree.remove(Integer.parseInt(sc.next()));
            }
        }
    }
}
