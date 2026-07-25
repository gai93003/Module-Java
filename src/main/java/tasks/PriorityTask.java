package tasks;

public class PriorityTask extends Task {
    private final String priorityLevel;

    public PriorityTask(String description, String priorityLevel) {
        super(description);
        if (priorityLevel == null || priorityLevel.trim().isEmpty()) {
            throw new IllegalArgumentException("Priority level cannot be empty");
        }
        this.priorityLevel = priorityLevel.toUpperCase();
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    @Override
    public String getStatus() {
        return super.getStatus() + " (Priority: " + priorityLevel + ") [Type: Priority]";
    }
}