package PubSub;

public interface ISubscriber {
    void recieveMessage(String topic,String message); 
}
