package DecoratorPattern.Toppings;

import DecoratorPattern.Pizza.BasePizza;

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
