package ArvoreAVL;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> arvore = new Tree<>();
        arvore.add(30);
        arvore.add(15);
        arvore.add(35);
        arvore.add(40);
        arvore.add(45);
        System.out.println(arvore.preOrdem());
    }
}
