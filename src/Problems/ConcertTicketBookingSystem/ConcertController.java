package Problems.ConcertTicketBookingSystem;

import java.util.Map;

public class ConcertController {
   private final Map<String,Concert> concerts;
   private final Map<String,Booking> bookings;

   public ConcertController(Map<String, Concert> concerts, Map<String, Booking> bookings) {
      this.concerts = concerts;
      this.bookings = bookings;
   }
}
