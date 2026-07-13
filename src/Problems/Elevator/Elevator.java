package Problems.Elevator;

import Problems.Elevator.State.ElevatorState;
import Problems.Elevator.State.IdleState;

public class Elevator {
    private ElevatorState elevatorState;
    private int currentFloor;

    public Elevator(int currentFloor) {
        this.elevatorState = new IdleState(this);
        this.currentFloor = currentFloor;
    }

    public void setElevatorState(ElevatorState elevatorState) {
        this.elevatorState = elevatorState;
    }

    private void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
    public void moveUp() {
        elevatorState.moveUp();
    }

    public void moveDown() {
        elevatorState.moveDown();
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
