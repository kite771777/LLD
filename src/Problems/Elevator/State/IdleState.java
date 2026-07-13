package Problems.Elevator.State;

import Problems.Elevator.Elevator;

public class IdleState extends ElevatorState{
    public IdleState(Elevator elevator) {
        super(elevator);
    }

    @Override
    public void moveUp(){
        System.out.println("Idle! Up");
    }
    @Override
    public void moveDown(){
        System.out.println("Idle! Down");
    }
}
