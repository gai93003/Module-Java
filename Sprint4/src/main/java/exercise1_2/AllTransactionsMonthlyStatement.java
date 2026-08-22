package exercise1_2;

public class AllTransactionsMonthlyStatement implements Statement {
    private final String accountId;

    public AllTransactionsMonthlyStatement(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public String getStatementData() {
        return "Statement [All Transactions] for Account: " + accountId + "\n- Salary: +£2500.00\n- Groceries: -£150.00";
    }
}