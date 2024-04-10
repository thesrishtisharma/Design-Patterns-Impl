package design.patterns.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Channel {
    private String name;
    private List<Subscribers> subscribers = new ArrayList<>();

    public void subscribe(Subscribers sub){
        subscribers.add(sub);
    }

    public void unsubscribe(Subscribers sub){
        subscribers.remove(sub);
    }

    public void notifySubscribers(){
        for(Subscribers sub: subscribers)
            sub.update();
    }

    public void upload(String name){
        this.name = name;
        notifySubscribers();
    }
}
