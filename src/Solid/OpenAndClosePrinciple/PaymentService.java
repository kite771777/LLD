package Solid.OpenAndClosePrinciple;

class PaymentService {
    public void processPayment(PaymentStrategy strategy) {
        strategy.pay();
    }
}