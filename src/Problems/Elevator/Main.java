package Problems.Elevator;

import Problems.Elevator.Request.Direction;
import Problems.Elevator.Request.Request;
import Problems.Elevator.Request.RequestSource;
import Problems.Elevator.Strategy.NearestStrategy;

public class Main {
    public static void main(String[] args) {
        ElevatorSystem building = new ElevatorSystem(new NearestStrategy());

        building.addElevator(new Elevator(1)); // Elevator 1, Floor 1 par hai
        building.addElevator(new Elevator(5)); // Elevator 2, Floor 5 par hai

        Request request = new Request(Direction.UP, RequestSource.EXTERNAL, 2);

        building.handleRequest(request);
    }
}
