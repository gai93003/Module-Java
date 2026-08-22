package exercise3_2;

public class PaymentService {
    private CardProcessor cardProcessor;
    private CashProcessor cashProcessor;

    public void processPayment(Payment payment) {
        if (payment == null) {
            throw new IllegalArgumentException("Payment cannot be null");
        }

        if (payment.hasCardDetails()) {
            cardProcessor.process(payment);
        } else {
            cashProcessor.process(payment);
        }
    }
}