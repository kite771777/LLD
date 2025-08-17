package Problems.BookMyShow.main;

import Problems.BookMyShow.services.BookingService;

public class BookMyShow {
    public static void main(String[] args) {

        BookingService bookService = BookingService.getInstance(); //Use a Singleton Pattern
        bookService.initialize();
        bookService.startBookingSession();
    }
}