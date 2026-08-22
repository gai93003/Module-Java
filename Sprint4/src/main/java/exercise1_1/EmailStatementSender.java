package exercise1_1;

/**
 * Implementation of the StatementSender abstract class that sends bank statement via email
 */
public class EmailStatementSender implements StatementSender {
    @Override
    public void sendStatement (String statementContent) {
        System.out.println("Success: Statement sent via email.");
    }
}