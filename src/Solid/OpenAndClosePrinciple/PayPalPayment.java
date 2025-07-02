package Solid.OpenAndClosePrinciple;

class PayPalPayment implements PaymentStrategy {
    public void pay() {
        System.out.println("Paid using PayPal");
    }
}
