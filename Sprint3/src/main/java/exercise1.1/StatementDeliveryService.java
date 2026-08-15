public class StatementDeliveryService {
    public void deliveryStatement(String statementContent, StatementSender statementSender) {
        statementSender.sendStatement(statementContent);
    }
}