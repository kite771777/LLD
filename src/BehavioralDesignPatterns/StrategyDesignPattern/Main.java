package BehavioralDesignPatterns.StrategyDesignPattern;

import BehavioralDesignPatterns.StrategyDesignPattern.ContextClass.PaymentContext;

public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext=new PaymentContext();
        paymentContext.setStrategy(new CreditCardPayment());
        paymentContext.makePayment(1000);
    }
}
