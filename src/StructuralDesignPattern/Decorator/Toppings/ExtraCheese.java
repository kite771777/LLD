package StructuralDesignPattern.Decorator.Toppings;

import StructuralDesignPattern.Decorator.Pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;
    public ExtraCheese(BasePizza pizza){
        this.basePizza=pizza;
    }
    @Override
    public int cost(){
        return basePizza.cost()+20;
    }
}
