package Problems.ParkingLot.Payments;

public class UPIPayment implements PaymentStrategy{
    @Override
    public void processPayment(double amount){
        System.out.println("UPI Payment "+ amount);
    }
}
