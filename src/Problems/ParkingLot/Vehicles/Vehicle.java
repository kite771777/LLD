package Problems.ParkingLot.Vehicles;

public abstract class Vehicle {
    private final String licencePlate;
    private final String vehicleType;

    //Constructor to initialize vehicle
    Vehicle(String licencePlate, String vehicleType) {
        this.licencePlate = licencePlate;
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return licencePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }
    public abstract double calculateFee(int hoursStayed);
}
