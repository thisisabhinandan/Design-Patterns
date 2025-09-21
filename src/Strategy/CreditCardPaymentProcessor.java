package Strategy;

public class CreditCardPaymentProcessor implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPaymentProcessor(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " Using Credit Card " + cardNumber);
    }
}
