package Strategy;

public class UPIPaymentProcessor implements PaymentStrategy {
    int phno;
    public UPIPaymentProcessor(int phno)
    {
        this.phno = phno;
    }
    @Override
    public void pay(int amount)
    {
        System.out.println("Paid " + amount + " Using UPI " + phno);
    }
}
