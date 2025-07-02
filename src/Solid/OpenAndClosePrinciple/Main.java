package Solid.OpenAndClosePrinciple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter payment method (UPI, CREDIT_CARD, PAYPAL): ");
        String input = scanner.nextLine().toUpperCase();

        PaymentStrategy strategy;

        switch (input) {
            case "UPI":
                strategy = new UpiPayment();
                break;
            case "CREDIT_CARD":
                strategy = new CreditCardPayment();
                break;
            case "PAYPAL":
                strategy = new PayPalPayment();
                break;
            default:
                System.out.println("Invalid payment method.");
                return;
        }

        service.processPayment(strategy);
    }
}
