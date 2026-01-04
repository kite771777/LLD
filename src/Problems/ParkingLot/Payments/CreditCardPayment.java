package Problems.ParkingLot.Payments;

public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount){
        System.out.println("Credit Card Payment "+ amount);
    }
}
