package exercise1_1;

public class StatementDeliveryService {
    public void deliveryStatement(String statementContent, StatementSender statementSender) {
        statementSender.sendStatement(statementContent);
    }
}