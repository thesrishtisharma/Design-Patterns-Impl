package design.patterns.observer;

import lombok.Data;

@Data
public class Subscribers {

    private String name;

    /**
     *     Assuming that as per this design pattern each subscriber can
     *     subscribe to only one channel but one channel can have many subscribers.
      */
    private Channel channel;

    public Subscribers(String name){
        super();
        this.name = name;
    }

    public void update(){
        System.out.println("Hey " + name + "! New video uploaded : " + channel.getName());
    }

    public void subscribeChannel(Channel channel){
        this.channel = channel;
    }

}


