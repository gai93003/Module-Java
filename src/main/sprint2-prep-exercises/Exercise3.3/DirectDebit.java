class DirectDebit extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Processing Direct Debit payment of " + amount);
    }
}