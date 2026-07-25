public class ApplicationLogger {
    private final FileLogger fileLogger = new FileLogger();

    public void logInfo(String message) {
        log("[INFO] " + message);
    }

    public void logError(String message) {
        log("[ERROR] " + message);
    }

    private void log(String formattedMessage) {
        fileLogger.openFile();
        fileLogger.writeLine(formattedMessage);
        fileLogger.closeFile();
    }
}