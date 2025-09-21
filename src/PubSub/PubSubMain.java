package PubSub;

public class PubSubMain {
    public static void main(String[] args) {
        Broker messageBroker=new Broker();
        Subscriber sub1=new Subscriber("Abhi");
        Subscriber sub2=new Subscriber("Ram");
        Subscriber sub3=new Subscriber("Krish");
        messageBroker.subscribe("Java",sub1);
        messageBroker.subscribe("Sports",sub2);
        messageBroker.subscribe("Sports",sub3);
        Publisher publisher=new Publisher(messageBroker);
        publisher.publish("Java","New version released");
        publisher.publish("Sports","India wins");
    }
}
