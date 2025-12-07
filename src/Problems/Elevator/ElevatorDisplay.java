package Problems.Elevator;

public class ElevatorDisplay {
    int floor;
    Direction direction;

    public void setDisplay(int floor,Direction direction){
        this.direction=direction;
        this.floor=floor;
    }
    public void showDisplay(){
        System.out.println("Direction :" +direction+ "At Floor " +floor);
    }

}
