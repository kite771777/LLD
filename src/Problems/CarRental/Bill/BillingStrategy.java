package Problems.CarRental.Bill;

import Problems.CarRental.reservation.Reservation;

public interface BillingStrategy {

    Bill generateBill(Reservation reservation);
}


