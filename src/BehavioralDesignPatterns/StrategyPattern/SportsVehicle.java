package BehavioralDesignPatterns.StrategyPattern;

import BehavioralDesignPatterns.StrategyPattern.Strategy.DriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle(DriveStrategy driveStrategy){super(driveStrategy);}
}
