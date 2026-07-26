class Checkout {
    private PaymentMethod paymentMethod;

    public Checkout(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        System.out.println("Initiating checkout process...");
        paymentMethod.pay(amount); // Delegates to the contained instance
    }
}