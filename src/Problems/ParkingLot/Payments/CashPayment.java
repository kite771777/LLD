package Problems.ParkingLot.Payments;

public class CashPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount){
        System.out.println("Cash Payment "+ amount);
    }
}
