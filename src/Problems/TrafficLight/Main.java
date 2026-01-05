package Problems.TrafficLight;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight=new TrafficLight(); //RED
        trafficLight.change(); //RED->GREEN
        trafficLight.change(); // GREEN->YELLOW
        trafficLight.change(); //YELLOW->RED

    }
}
