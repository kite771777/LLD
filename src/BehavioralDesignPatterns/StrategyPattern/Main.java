package BehavioralDesignPatterns.StrategyPattern;

import BehavioralDesignPatterns.StrategyPattern.Strategy.NormalDriveStrategy;
import BehavioralDesignPatterns.StrategyPattern.Strategy.SportyDriveStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new SportsVehicle(new SportyDriveStrategy());
        car.drive();


        Vehicle bike = new OffRoadVehicle(new NormalDriveStrategy());
        bike.drive();
    }
}



