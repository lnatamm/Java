package ArvoreAVL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> arvore = new Tree<>();
        /*arvore.add(35);
        arvore.add(30);
        arvore.add(40);
        arvore.add(34);
        arvore.add(37);
        arvore.add(45);
        arvore.add(28);
        arvore.add(27);
        arvore.add(50);*/
        /*arvore.add(30);
        arvore.add(16);
        arvore.add(17);
        arvore.add(40);
        arvore.add(53);
        arvore.add(24);
        arvore.add(78);
        arvore.add(14);
        arvore.add(3);
        arvore.add(1);
        arvore.add(7);
        arvore.add(28);
        arvore.add(23);
        arvore.add(46);
        arvore.add(15);
        arvore.add(39);*/
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        for(int i = 0; i < n; i++){
            arvore.add(Integer.parseInt(sc.next()));
        }
        System.out.println(arvore);
        while(!arvore.isEmpty()){
            arvore.remove(Integer.parseInt(sc.next()));
            if(!arvore.isEmpty()) {

                System.out.println(arvore);
            }
        }
    }
}