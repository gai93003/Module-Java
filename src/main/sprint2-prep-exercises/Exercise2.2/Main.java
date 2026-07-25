public class Main {
    public static void main(String[] args) {
        ApplicationLogger logger = new ApplicationLogger();

        logger.logInfo("Application started successfully.");
        logger.logError("Failed to connect to database.");
    }
}