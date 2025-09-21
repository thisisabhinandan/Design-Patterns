package PubSub;

import java.util.*;

public class Broker {
    Map<String, List<Subscriber>> messageList=new HashMap<>();

    public void subscribe(String topics, Subscriber subscriber) {
        messageList.putIfAbsent(topics,new ArrayList<>());
        messageList.get(topics).add(subscriber);
    }
    public void publish(String topics,String message)
    {
        List<Subscriber> subscriberList=new ArrayList<>();
        subscriberList=messageList.get(topics);
        for(Subscriber subscribers:subscriberList)
        {
            subscribers.recieveMessage(topics,message);
        }
    }

}
