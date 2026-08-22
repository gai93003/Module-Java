package exercise1_2;

public class Main {
    public static void main (String[] args) {
        StatementDeliveryService deliveryService = new StatementDeliveryService();
        StatementService statementService = new StatementService(deliveryService);


        StatementSender emailSender = new EmailStatementSender();
        StatementSender letterSender = new LetterStatementSender();


        statementService.createAndSendAllTransactionsStatement("Deng---2020!", emailSender);
        statementService.createAndSendAllTransactionsStatement("Cholloo-2929", letterSender);    }
}