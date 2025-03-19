package StrategyPattern.Strategy;

public class SportyDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("SportyDriveStrategy: Driving on sporty terrain");
    }
}
