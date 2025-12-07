package StrategyPattern;

import StrategyPattern.Strategy.NormalDriveStrategy;
import StrategyPattern.Strategy.SportyDriveStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new SportsVehicle(new SportyDriveStrategy());
        car.drive();


        Vehicle bike = new OffRoadVehicle(new NormalDriveStrategy());
        bike.drive();
    }
}



