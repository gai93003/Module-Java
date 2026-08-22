package exercise1_2;

/**
 * An implementation of the StatementSender abstract class that delivers bank statement
 * as physical letters to address via post.
 */
public class LetterStatementSender implements StatementSender {
    @Override
    public void sendStatement(String statementContent) {
        System.out.println("Success: Statement sent via Letter.");
    }

    @Override
    public void sendStatement(Statement statement) {
        sendStatement(statement.getStatementData());
    }
}