import oops.Animal;

public class Main extends Animal {
    public static void main(String[] args) {
        Animal dog =new Animal();
        Main m=new Main();
        m.eat();
        dog.eat();
        System.out.println("Hello, World!");
    }
}