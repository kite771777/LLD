package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new SportsVehicle();
        car.drive();
        Vehicle bike = new OffRoadVehicle();
        bike.drive();
    }
}
