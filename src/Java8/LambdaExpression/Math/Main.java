package Java8.LambdaExpression.Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MathOp add=(a,b)->a+b;
        System.out.println(add.operate(12,34));
        MathOp sub=(a,b)-> a-b;
        System.out.println(sub.operate(122,2));
        MathOp div=(a,b)->a/b;
        System.out.println(div.operate(12,6));
    }
}
