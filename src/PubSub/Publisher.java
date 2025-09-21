package PubSub;

public class Publisher {
    private Broker broker;

    public Publisher(Broker broker) {
        this.broker = broker;
    }

    public void publish(String topic, String message) {
        broker.publish(topic,message);
    }
}
