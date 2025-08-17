package CreationalDesignPatterns.FactoryPattern;


public class Main {
    public static void main(String [] args){
        Shape shape=ShapeFactory.getShape("Circle");
        assert shape != null;
        shape.draw();
    }
}
