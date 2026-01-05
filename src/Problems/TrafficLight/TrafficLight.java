package Problems.TrafficLight;

public class TrafficLight {
    private TrafficLightState state;
    TrafficLight(){
        this.state=new RedState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void change(){
        state.action(this);
    }
}
