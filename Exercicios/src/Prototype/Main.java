package Prototype;

public class Main {
    public static void main(String[] args) {
        Aviao aviao1 = new Aviao();
        Aviao aviao2 = aviao1.clone();
        System.out.println(aviao1.getModelo());
        System.out.println(aviao2.getModelo());
    }
}
