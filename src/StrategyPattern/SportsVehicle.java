package StrategyPattern;

import StrategyPattern.Strategy.SportyDriveStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle(){super(new SportyDriveStrategy());}
}
