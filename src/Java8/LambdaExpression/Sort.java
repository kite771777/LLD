package Java8.LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Sort {

    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>(Arrays.asList(
                "Apple",
                "Banana",
                "Mango",
                "Grapes",
                "Orange",
                "Strawberry",
                "Watermelon",
                "Pineapple",
                "Papaya",
                "Kiwi"));

        fruits.sort((a,b)-> b.length()-a.length());
        System.out.println(fruits);
        List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9, 3, 7, 4, 6, 10));
        numbers.sort((a,b)->a-b);
        System.out.println(numbers);
        numbers.forEach(n->{
            if(n%2==0) System.out.println(n);
        });
        String s="ritik";

        fruits.forEach(n->{
            if(n.length()>6) System.out.println("yeyy");
        });
        int score = 100; // Local variable

        // This Lambda uses 'score'
        Runnable r = () -> System.out.println(score);
       // score = 200;
        // ERROR! This line makes 'score' NOT effectively final.
        // The compiler will cry: "Local variable score defined in an enclosing
        // scope must be final or effectively final"
        Predicate<Integer> isAdult = age -> age >= 18;
        System.out.println(isAdult.test(20)); // Output: true
    }
}
