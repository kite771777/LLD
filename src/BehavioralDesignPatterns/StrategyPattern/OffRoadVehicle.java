package BehavioralDesignPatterns.StrategyPattern;

import BehavioralDesignPatterns.StrategyPattern.Strategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(DriveStrategy driveStrategy){super(driveStrategy);}
}
