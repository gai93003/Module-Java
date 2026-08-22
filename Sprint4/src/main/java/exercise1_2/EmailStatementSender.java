package exercise1_2;

/**
 * Implementation of the StatementSender abstract class that sends bank statement via email
 */
public class EmailStatementSender implements StatementSender {
    @Override
    public void sendStatement (String statementContent) {
        System.out.println("Success: Statement sent via email.");
    }

    @Override
    public void sendStatement(Statement statement) {
        sendStatement(statement.getStatementData());
    }
}