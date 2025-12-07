package ObserverPattern.Problem2.Observer;

public interface Subscriber {
    void update(String video); // This is the method the observer will use to get updated with the new video
}
