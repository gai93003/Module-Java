public interface StatementSender {
    /**
     * Send the provided statement content to the customer using the specific delivery mechanism.
     * @param statementContent, the content of the bank statement.
     */
    void sendStatement(String statementContent);
}