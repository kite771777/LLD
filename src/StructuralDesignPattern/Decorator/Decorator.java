package StructuralDesignPattern.Decorator;

import StructuralDesignPattern.Decorator.Pizza.BasePizza;
import StructuralDesignPattern.Decorator.Pizza.VegDelight;
import StructuralDesignPattern.Decorator.Toppings.Cheese;
import StructuralDesignPattern.Decorator.Toppings.ExtraCheese;

public class Decorator {
    public static void main(String [] args){
        BasePizza pizza=new ExtraCheese(new Cheese(new VegDelight()));
        System.out.println("Total Cost: " + pizza.cost());
    }
}
