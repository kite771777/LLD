package Problems.Elevator;

import Problems.Elevator.Request.Request;
import Problems.Elevator.Strategy.ElevatorStrategy;
import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    private final List<Elevator> elevators;
    private final Dispatcher dispatcher;

    public ElevatorSystem(ElevatorStrategy strategy) {
        this.elevators = new ArrayList<>();
        this.dispatcher = new Dispatcher(strategy);
    }

    public void addElevator(Elevator elevator) {
        elevators.add(elevator);
    }

    public void handleRequest(Request request) {
        System.out.println("System received request for floor: " + request.getTargetFloor());
        dispatcher.dispatch(elevators, request);
    }
}
