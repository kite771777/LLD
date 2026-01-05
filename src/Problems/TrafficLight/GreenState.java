package Problems.TrafficLight;

public class GreenState implements TrafficLightState{
    @Override
    public void action(TrafficLight signal) {
        System.out.println("State is Green Changing to Yellow");
        signal.setState(new YellowState());
    }
}
