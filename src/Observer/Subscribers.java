package Observer;

public class Subscribers implements Observer {
    String name;

    public Subscribers(String name) {
        this.name = name;
    }

    public void update(String message)
    {
        System.out.println(name+" recived notification "+message);
    }

}
