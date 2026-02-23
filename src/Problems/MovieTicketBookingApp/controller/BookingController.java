package Problems.MovieTicketBookingApp.controller;

import Problems.MovieTicketBookingApp.entities.Booking;
import Problems.MovieTicketBookingApp.entities.Show;
import Problems.MovieTicketBookingApp.entities.User;
import Problems.MovieTicketBookingApp.service.BookingService;

import java.util.List;
import java.util.UUID;

public class BookingController {
    private final BookingService bookingService;

    public BookingController() {
        this.bookingService = new BookingService();
    }

    public Booking createBooking(User user, Show show, List<Integer> seats) {
        return bookingService.book(user, show, seats);
    }

    public Booking getBooking(UUID bookingId) {
        return bookingService.getBooking(bookingId);
    }

    public List<Booking> getBookingsForUser(User user) {
        return bookingService.getBookingsForUser(user);
    }
}
