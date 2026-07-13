package Problems.Elevator.Request;

public class Request {
    private final Direction direction;
    private final RequestSource requestSource;
    private final int targetFloor;
    public Request(Direction direction, RequestSource requestSource, int targetFloor) {
        this.direction = direction;
        this.requestSource = requestSource;
        this.targetFloor = targetFloor;
    }

    public Direction getDirection() {
        return direction;
    }

    public RequestSource getRequestSource() {
        return requestSource;
    }

    public int getTargetFloor() {
        return targetFloor;
    }
}
