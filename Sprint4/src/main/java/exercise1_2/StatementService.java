package exercise1_2;

public class StatementService {
    private final StatementDeliveryService deliveryService;

    public StatementService(StatementDeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void createAndSendAllTransactionsStatement(String accountId, StatementSender sender) {
        Statement statement = new AllTransactionsMonthlyStatement(accountId);
        deliveryService.deliverStatement(statement, sender);
    }

    public void createAndSendOutgoingStatement(String accountId, StatementSender sender) {
        Statement statement = new OutgoingTransactionsMonthlyStatement(accountId);
        deliveryService.deliverStatement(statement, sender);
    }
}