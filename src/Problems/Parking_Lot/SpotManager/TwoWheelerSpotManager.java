package Problems.Parking_Lot.SpotManager;

import Problems.Parking_Lot.Entity.ParkingSpot;
import Problems.Parking_Lot.LookupStrategy.ParkingSpotLookupStrategy;

import java.util.List;

public class TwoWheelerSpotManager extends ParkingSpotManager {

    /*
     1. Maintains a list of Two Wheeler Spots only
     2. Has its own lookup strategy
     3. Has its own lock, to avoid conflicts with other spot managers
     */
    public  TwoWheelerSpotManager(List<ParkingSpot> spots, ParkingSpotLookupStrategy strategy) {
        super(spots, strategy);
    }
}

