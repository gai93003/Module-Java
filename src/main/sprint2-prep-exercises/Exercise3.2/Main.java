public class Main {
    public static void main(String[] args) {
        System.out.println("--- PaymentMethod (Base) ---");
        PaymentMethod basePayment = new PaymentMethod();
        basePayment.pay(50.0);             // Calls pay(double)
        basePayment.pay(50.0, "GBP");      // Calls overloaded pay(double, String)

        System.out.println("\n--- DirectDebit (Subclass) ---");
        PaymentMethod directDebit = new DirectDebit();
        directDebit.pay(100.0);            // Calls OVERRIDDEN pay(double) on DirectDebit
        directDebit.pay(100.0, "EUR");     // Calls INHERITED pay(double, String) from PaymentMethod
    }
}