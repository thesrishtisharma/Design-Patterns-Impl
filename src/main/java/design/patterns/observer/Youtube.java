package design.patterns.observer;

import lombok.Data;

public class Youtube {
    public static void main(String[] args) {

        Channel codeWithMe = new Channel();

        Subscribers sub1 = new Subscribers("Srishti");
        Subscribers sub2 = new Subscribers("Niharika");
        Subscribers sub3 = new Subscribers("Jyoti");
        Subscribers sub4 = new Subscribers("Vritika");
        Subscribers sub5 = new Subscribers("Pranika");

        codeWithMe.subscribe(sub1);
        codeWithMe.subscribe(sub2);
        codeWithMe.subscribe(sub3);
        codeWithMe.subscribe(sub4);
        codeWithMe.subscribe(sub5);

        sub1.subscribeChannel(codeWithMe);
        sub2.subscribeChannel(codeWithMe);
        sub3.subscribeChannel(codeWithMe);
        sub4.subscribeChannel(codeWithMe);
        sub5.subscribeChannel(codeWithMe);

        codeWithMe.upload("Programming 101 : Tips and tricks");
    }
}
