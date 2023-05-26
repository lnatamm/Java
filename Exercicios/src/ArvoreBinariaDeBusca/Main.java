package ArvoreBinariaDeBusca;

public class Main {

    public static void main(String[] args) {
        
        Tree<Integer> arvore = new Tree<>();
        arvore.add(6);
        arvore.add(2);
        arvore.add(8);
        arvore.add(1);
        arvore.add(4);
        arvore.add(3);
        arvore.add(12);
        System.out.println(arvore);
        System.out.println(arvore.height());

    }
    
}
