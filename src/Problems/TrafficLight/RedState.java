package Problems.TrafficLight;

public class RedState implements TrafficLightState{
    @Override
    public void action(TrafficLight signal) {
        System.out.println("State is Red Changing to Green");
        signal.setState(new GreenState());
    }
}
