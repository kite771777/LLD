package Java8.LambdaExpression.Question1;

public class Main {
    public static void main(String[] args) {
        Greeter s = (name) -> System.out.println("Welcome to Java 8,"+ name + "!");
        s.sayHello("Ritik");
    }
}
