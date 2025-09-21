package Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();
        
        // Pay using UPI
        System.out.println("=== Processing UPI Payment ===");
        PaymentStrategy upiPayment = new UPIPaymentProcessor(1234567890);
        cart.setPaymentStrategy(upiPayment);
        cart.checkout(1000);
        
        // Pay using Credit Card
        System.out.println("\n=== Processing Credit Card Payment ===");
        PaymentStrategy creditCardPayment = new CreditCardPaymentProcessor("4111-1111-1111-1111");
        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout(2500);
    }
}
