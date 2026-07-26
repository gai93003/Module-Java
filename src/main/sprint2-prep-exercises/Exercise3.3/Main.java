public class Main {
    public static void main(String[] args) {
        PaymentMethod initialMethod = new DirectDebit();
        Checkout checkout = new Checkout(initialMethod);

        checkout.processPayment(75.50);

        System.out.println("\n--- Switching Payment Method ---");
        PaymentMethod card = new CreditCard("4111222233334444");
        checkout.setPaymentMethod(card);

        checkout.processPayment(120.00);
    }
}