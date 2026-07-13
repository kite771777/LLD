package Problems.Elevator.State;

import Problems.Elevator.Elevator;

public class MovingDownState extends ElevatorState{
    MovingDownState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void moveDown(){
        System.out.println("Moving-down");
    }
}
