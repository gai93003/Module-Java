package exercise3_2;

class CardProcessor {
    public void process(Payment payment) {
        System.out.println("Processing card payment with card: " + payment.getCardNumber());
    }
}

class CashProcessor {
    public void process(Payment payment) {
        System.out.println("Processing cash payment.");
    }
}

class Payment {
    public boolean hasCardDetails() {
        return getCardNumber() != null && !getCardNumber().isEmpty();
    }

    public String getCardNumber() {
        return null;
    }
}