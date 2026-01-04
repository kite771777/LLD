package Problems.ParkingLot.Vehicles;

public class TruckVehicle extends Vehicle{
    private static final double RATE=20.0;
    public TruckVehicle(String licencePlate){
        super(licencePlate,"Truck");
    }
    @Override
    public double calculateFee(int hoursStayed){
        return hoursStayed*RATE;
    }
}
