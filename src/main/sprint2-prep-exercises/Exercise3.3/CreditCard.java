class CreditCard extends PaymentMethod {
    private final String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    void pay(double amount) {
        System.out.println("Charging " + amount + " to Credit Card ending in "
                + cardNumber.substring(cardNumber.length() - 4));
    }
}