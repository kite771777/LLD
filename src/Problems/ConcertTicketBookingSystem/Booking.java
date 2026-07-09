package Problems.ConcertTicketBookingSystem;

import java.util.List;

public class Booking {
    private final String id;
    private final User user;
    private final Concert concert;
    private final List<Seat> seats;
    private final double totalPrice;
    private final BookingStatus status;

    public Booking(String id, User user, Concert concert, List<Seat> seats, double totalPrice, BookingStatus status) {
        this.id = id;
        this.user = user;
        this.concert = concert;
        this.seats = seats;
        this.totalPrice = totalPrice;
        this.status = status;
    }
    //
}
