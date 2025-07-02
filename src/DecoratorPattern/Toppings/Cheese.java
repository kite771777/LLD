package DecoratorPattern.Toppings;

import DecoratorPattern.Pizza.BasePizza;

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
