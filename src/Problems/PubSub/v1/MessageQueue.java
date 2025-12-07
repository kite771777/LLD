package Problems.PubSub.v1;

import java.util.LinkedList;
import java.util.List;

public class MessageQueue {
    private final List<String> queue=new LinkedList<>();

    public void publish(String message){
        queue.add(message);
    }
    public String subscriber(){
        try {
            if(!queue.isEmpty()){
                return queue.remove(0);
            }
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
