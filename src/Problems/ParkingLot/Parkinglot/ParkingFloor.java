package Problems.ParkingLot.Parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private List<ParkingSpot> spots;
    private int floorNumber;

    public ParkingFloor(int floorNumber, int numOfCarSpots,int numofBikeSpots) {
        this.spots = new ArrayList<>();
        this.floorNumber = floorNumber;
        for(int i=0;i<numOfCarSpots;i++){
            this.spots.add(new CarParkingSpot(i+1));
        }
        for(int i=numOfCarSpots;i<numOfCarSpots+numofBikeSpots;i++){
            this.spots.add(new BikeParkingSpot(i+1));
        }
    }
    // Method to find an available spot based on the vehicle type
    public ParkingSpot findAvailableSpot(String vehicleType) {
        for (ParkingSpot spot : spots) {
            if (!spot.isOccupied() && spot.getSpotType().equalsIgnoreCase(vehicleType)) {
                return spot;  // Return the first available spot for the vehicle type
            }
        }
        return null;  // No available spot found for the given vehicle type
    }

    // Method to return all parking spots on this floor
    public List<ParkingSpot> getParkingSpots() {
        return spots;
    }
}
