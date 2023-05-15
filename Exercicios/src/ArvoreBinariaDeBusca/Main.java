package ArvoreBinariaDeBusca;

public class Main {

    public static void main(String[] args) {
        
        Tree<Integer> arvore = new Tree<>();

        arvore.add(7);
        arvore.add(5);
        arvore.add(12);
        arvore.add(2);
        arvore.add(6);
        arvore.add(9);
        arvore.add(21);
        arvore.add(19);
        arvore.add(25);
        System.out.println(arvore.search(19));
        System.out.println(arvore.search(2));
        System.out.println(arvore.search(74));

    }
    
}
