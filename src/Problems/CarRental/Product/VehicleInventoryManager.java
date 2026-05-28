//package Problems.CarRental.Product;
//
//import java.time.LocalDate;
//import java.util.List;
//import java.util.Optional;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.ConcurrentMap;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class VehicleInventoryManager {
//    // vehicleId → Vehicle
//    private final ConcurrentMap<Integer, Vehicle> vehicles = new ConcurrentHashMap<>();
//
//    // vehicleId → list of reservation IDs (metadata index)
//    private final ConcurrentMap<Integer, List<Integer>> vehicleBookingIds = new ConcurrentHashMap<>();
//
//    // per-vehicle lock
//    private final ConcurrentMap<Integer, ReentrantLock> vehicleLocks = new ConcurrentHashMap<>();
//
//    private ReservationRepository reservationRepository;
//
//    public void addVehicle(Vehicle vehicle) {
//        vehicles.put(vehicle.getVehicleID(), vehicle);
//    }
//
//    public Optional<Vehicle> getVehicle(int vehicleId) {
//        return Optional.ofNullable(vehicles.get(vehicleId));
//    }
//
//    public void setReservationRepository(ReservationRepository reservationRepository) {
//        this.reservationRepository = reservationRepository;
//    }
//
//    private ReentrantLock lockForVehicle(int vehicleId) {
//        vehicleLocks.putIfAbsent(vehicleId, new ReentrantLock());
//        return vehicleLocks.get(vehicleId);
//    }
//
//    // ---------------- Availability Check ------------
//
//    public boolean isAvailable(int vehicleId, LocalDate from, LocalDate to) {
//        Vehicle vehicle = vehicles.get(vehicleId);
//
//        if (vehicle == null) return false;
//        if (vehicle.getVehicleStatus() == VehicleStatus.MAINTENANCE) return false;
//
//        DateInterval requested = new DateInterval(from, to);
//
//        List<Integer> reservationIDs = vehicleBookingIds.get(vehicleId);
//        if(reservationIDs == null || reservationIDs.isEmpty()) {
//            return true;
//        }
//        for (int reservationID : reservationIDs) {
//            Reservation reservation = reservationRepository.findById(reservationID).get();
//            LocalDate bookedFrom = reservation.getDateBookedFrom();
//            LocalDate bookedTill = reservation.getDateBookedTo();
//            DateInterval bookedInterval = new DateInterval(bookedFrom, bookedTill);
//            if (bookedInterval.overlaps(requested)) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}
