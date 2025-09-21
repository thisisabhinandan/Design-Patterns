package Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    String channelName;
    public Channel(String channelName)
    {
        this.channelName=channelName;
    }
    List<Observer> observersList=new ArrayList<>();

    @Override
    public void subscribe(Observer observer)
    {
        observersList.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer)
    {
        observersList.remove(observer);
    }

    @Override
    public void notifyAll(String message) {
        for(Observer obs:observersList)
        {
            obs.update(message);
        }
    }
    public void uploadVideo(String title)
    {
        System.out.println(channelName+" uploaded a video "+title);
        notifyAll("New video uploaded "+title);
    }

}
