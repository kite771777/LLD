package Solid.OpenAndClosePrinciple;

class CreditCardPayment implements PaymentStrategy {
    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}
