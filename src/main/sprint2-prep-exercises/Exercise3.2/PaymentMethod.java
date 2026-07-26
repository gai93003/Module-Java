class PaymentMethod {
    void pay(double amount) {
        System.out.println("Paying " + amount);
    }

    void pay(double amount, String currency) {
        System.out.println("Paying " + amount + " " + currency);
    }
}