package ArvoreAVL;

public class Main {
    public static void main(String[] args) {
        Tree<Integer> arvore = new Tree<>();
        arvore.add(50);
        arvore.add(20);
        arvore.add(90);
        arvore.add(10);
        arvore.add(40);
        arvore.add(30);
        System.out.println(arvore.preOrdem());
    }
}
