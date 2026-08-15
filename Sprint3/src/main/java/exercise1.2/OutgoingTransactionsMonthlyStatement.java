public class OutgoingTransactionsMonthlyStatement implements Statement {
    private final String accountId;

    public OutgoingTransactionsMonthlyStatement(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public String getStatementData() {
        return "Statement [Outgoing Transactions Only] for Account: " + accountId
                + "\n- Rent: -£800.00\n- Groceries: -£150.00";
    }
}