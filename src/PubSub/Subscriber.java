package PubSub;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements ISubscriber{
    private String name;
    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void recieveMessage(String topic, String message) {
        System.out.println(name + " received message on topic '" + topic + "': " + message);
    }
}
