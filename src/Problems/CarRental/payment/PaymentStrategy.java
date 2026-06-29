package Problems.CarRental.payment;

import Problems.CarRental.Bill.Bill;

public interface PaymentStrategy {

    Payment processPayment(Bill bill, double paymentAmount);
}
