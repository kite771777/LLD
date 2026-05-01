package Problems.Parking_Lot.LookupStrategy;

import Problems.Parking_Lot.Entity.ParkingSpot;

import java.util.List;

public interface ParkingSpotLookupStrategy {

    ParkingSpot selectSpot(List<ParkingSpot> spots);
}

