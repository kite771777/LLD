package Problems.Elevator.State;

import Problems.Elevator.Elevator;

public class MovingUpState extends ElevatorState{
    MovingUpState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void moveUp(){
        System.out.println("Moving-up!");
    }
}
