package Problems.ParkingLot.Vehicles;

public class CarVehicle extends Vehicle{
    private static final double RATE=10.0;
    public CarVehicle(String licencePlate){
        super(licencePlate,"Car");
    }
    @Override
    public double calculateFee(int hoursStayed){
        return hoursStayed*RATE;
    }
}
