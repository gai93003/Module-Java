public class Main {
    public static void main(String[] args) {
        StatementDeliveryService deliveryService = new StatementDeliveryService();

        StatementSender emailSender = new EmailStatementSender();
        StatementSender letterSender = new LetterStatementSender();

        deliveryService.deliveryStatement("sampleContent", emailSender);
        deliveryService.deliveryStatement("sampleContent", letterSender);
    }
}