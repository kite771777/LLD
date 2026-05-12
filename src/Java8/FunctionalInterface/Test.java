package Java8.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<Integer> isAdult = age -> age >= 18;
        System.out.println(isAdult.test(20)); // Output: true
        Function<String, Integer> lengthFinder = s -> s.length();
        System.out.println(lengthFinder.apply("Java8")); // Output: 5
        Consumer<String> printer = s -> System.out.println("Printing: " + s);
        printer.accept("Hello World");
    }
}
