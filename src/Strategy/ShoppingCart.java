package Strategy;

public class ShoppingCart {
    PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy=paymentStrategy;
    }
    public void checkout(int amount)
    {
        paymentStrategy.pay(amount);
    }
}
