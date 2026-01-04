package Problems.ParkingLot.Payments;

import java.util.Scanner;

public class PaymentService {
    private Scanner scanner;
    Payment payment;

    public PaymentService(Scanner scanner) {
        this.scanner = scanner;
    }
    public void processPayment(double fee){
        choosePaymentMethod(fee);
    }
    public void choosePaymentMethod(double fee){
        System.out.println("Total fee: "+ fee);
        System.out.println("Choose payment method:");
        System.out.println("1. Cash");
        System.out.println("2. UPI");
        System.out.println("3. Credit Card");

        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                payment=new Payment(fee, new CashPayment());
                break;
            case 2:
                payment=new Payment(fee, new UPIPayment());
                break;
            case 3:
                payment=new Payment(fee, new CreditCardPayment());
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Cash Payment!");
                payment=new Payment(fee, new CashPayment());
                break;

        }
        payment.processPayment();
    }
}
