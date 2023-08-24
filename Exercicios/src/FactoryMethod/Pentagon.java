package FactoryMethod;

public class Pentagon extends AGeometric{
    @Override
    void draw() {
        System.out.println(" /\\");
        System.out.println("|  |");
        System.out.println(" __");
    }
}
