package Problems.Elevator.Strategy;

import Problems.Elevator.Elevator;
import Problems.Elevator.Request.Request;

import java.util.List;

public interface ElevatorStrategy {
    Elevator findBestElevator(List<Elevator> elevators, Request request);
}
