package StrategyPattern;

import StrategyPattern.Strategy.DriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle(DriveStrategy driveStrategy){super(driveStrategy);}
}
