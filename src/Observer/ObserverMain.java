package Observer;

public class ObserverMain {
    public static void main(String[] args) {
        Subscribers subscribers1=new Subscribers("Abhi");
        Subscribers subscribers2=new Subscribers("Ram");
        Subscribers subscribers3=new Subscribers("Krish");

        Channel Tseries=new Channel("Tseries");
        Channel PewDiePie=new Channel("PewdiePie");
        Tseries.subscribe(subscribers1);
        Tseries.subscribe(subscribers3);
        PewDiePie.subscribe(subscribers2);
        Tseries.uploadVideo("Song");
        PewDiePie.uploadVideo("Minecraft");
        PewDiePie.unsubscribe(subscribers2);
        PewDiePie.uploadVideo("Great");
    }
}
