class Configuration {
    public static final int MAX_USERS = 100;
    private final String systemName;

    public Configuration(String systemName) {
        MAX_USERS = 5;
        this.systemName = systemName;
    }
}