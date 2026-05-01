package Problems.Parking_Lot.Entity;

public class ParkingSpot {
    String spotId;
    boolean isFree;

    public ParkingSpot(String spotId) {
        this.spotId = spotId;
    }

    public boolean isSpotFree() {
        return isFree;
    }

    public void occupySpot() {
        isFree = false;
    }

    public void releaseSpot() {
        isFree = true;
    }

    public String getSpotId() {
        return spotId;
    }

}
