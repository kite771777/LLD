package BehavioralDesignPatterns.StrategyDesignPattern.ContextClass;

import BehavioralDesignPatterns.StrategyDesignPattern.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy paymentStrategy){
        this.strategy=paymentStrategy;
    }
    public void makePayment(int amount){
        strategy.pay(amount);
    }
}
