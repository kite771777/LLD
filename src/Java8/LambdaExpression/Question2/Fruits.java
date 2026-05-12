package Java8.LambdaExpression.Question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fruits {

    public static void main(String[] args) {
        List<String> fruits=new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
        fruits.forEach(n-> System.out.println(n.toUpperCase()));
    }
}
