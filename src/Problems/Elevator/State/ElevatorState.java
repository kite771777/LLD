package Problems.Elevator.State;

import Problems.Elevator.Elevator;

public abstract class ElevatorState{
    private Elevator elevator;
    ElevatorState(Elevator elevator){
        this.elevator = elevator;
    }
    public void moveUp() {
        System.out.println("Action 'Move Up' not allowed in this state!");
    }
    public void moveDown() {
        System.out.println("Action 'Move Down' not allowed in this state!");
    }
}
