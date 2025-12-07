package StrategyPattern;

import StrategyPattern.Strategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle {
    OffRoadVehicle(DriveStrategy driveStrategy){super(driveStrategy);}
}
