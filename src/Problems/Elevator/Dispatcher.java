package Problems.Elevator;

import Problems.Elevator.Request.Request;
import Problems.Elevator.Strategy.ElevatorStrategy;
import java.util.List;

public class Dispatcher {
    private ElevatorStrategy strategy;

    public Dispatcher(ElevatorStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ElevatorStrategy strategy) {
        this.strategy = strategy;
    }

    public void dispatch(List<Elevator> elevators, Request request) {
        Elevator bestElevator = strategy.findBestElevator(elevators, request);
        if (bestElevator != null) {
            System.out.println("Dispatching elevator to target floor: " + request.getTargetFloor());
        } else {
            System.out.println("ERROR: No elevator available to handle this request!");
        }
    }
}