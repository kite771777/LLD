package Problems.TrafficLight;

public class YellowState implements TrafficLightState{
    @Override
    public void action(TrafficLight signal) {
        System.out.println("State is Yellow Changing to Red");
        signal.setState(new RedState());
    }
}
