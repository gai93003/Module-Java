public interface StatementSender {
    void sendStatement(String statementContent);
    void sendStatement(Statement statement);
}