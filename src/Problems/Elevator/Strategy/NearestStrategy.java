package Problems.Elevator.Strategy;


import Problems.Elevator.Elevator;
import Problems.Elevator.Request.Request;

import java.util.List;

public class NearestStrategy implements ElevatorStrategy {
    @Override
    public Elevator findBestElevator(List<Elevator> elevators, Request request) {
        Elevator bestElevator = null;
        int minDistance = Integer.MAX_VALUE;
        for (Elevator elevator : elevators) {
            int distance = Math.abs(elevator.getCurrentFloor() - request.getTargetFloor());
            if (distance < minDistance) {
                minDistance = distance;
                bestElevator = elevator;
            }
        }
        return bestElevator;
    }
}
