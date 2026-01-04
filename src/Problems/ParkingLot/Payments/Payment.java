package Problems.ParkingLot.Payments;

public class Payment {
    private final double amount;
    private final PaymentStrategy paymentStrategy;

    public Payment(double amount, PaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }
    public void processPayment(){
        if(amount>0){
            paymentStrategy.processPayment(amount);
        } else{
            System.out.println("Invalid payment amount.");
        }
    }
}
