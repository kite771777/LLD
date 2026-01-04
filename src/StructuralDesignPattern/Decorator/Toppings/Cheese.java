package StructuralDesignPattern.Decorator.Toppings;

import StructuralDesignPattern.Decorator.Pizza.BasePizza;

public class Cheese extends ToppingDecorator {
    BasePizza basePizza;
    public Cheese(BasePizza pizza){
        this.basePizza=pizza;
    }
    @Override
    public int cost(){
        return basePizza.cost()+10;
    }
}
