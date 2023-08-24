package FactoryMethod;

public class ShapeFactory {
    public static AGeometric getShape(String name){
        if(name.equals("Triangle")){
            return new Triangle();
        }
        if(name.equals("Square")){
            return new Square();
        }
        if(name.equals("Pentagon")){
            return new Pentagon();
        }
        if(name.equals("Circle")){
            return new Circle();
        }
        return null;
    }
}
