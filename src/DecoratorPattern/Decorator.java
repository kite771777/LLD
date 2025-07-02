package DecoratorPattern;

import DecoratorPattern.Pizza.BasePizza;
import DecoratorPattern.Pizza.VegDelight;
import DecoratorPattern.Toppings.Cheese;
import DecoratorPattern.Toppings.ExtraCheese;

public class Decorator {
    public static void main(String [] args){
        BasePizza pizza=new ExtraCheese(new Cheese(new VegDelight()));
        System.out.println("Total Cost: " + pizza.cost());
    }
}
