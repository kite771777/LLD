package Problems.ParkingLot.Vehicles;

public class BikeVehicle extends Vehicle{
    private static final double RATE=5.0;
    public BikeVehicle(String licencePlate){
        super(licencePlate,"Bike");
    }
    @Override
    public double calculateFee(int hoursStayed){
        return hoursStayed*RATE;
    }
}