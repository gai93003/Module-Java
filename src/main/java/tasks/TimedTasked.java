package tasks;

public class TimedTasked extends Task {
    private final String deadline;

    public TimedTasked(String description, String deadline) {
        super(description);
        if (deadline == null || deadline.trim().isEmpty()) {
            throw new IllegalArgumentException("Deadline cannot be empty");
        }
        this.deadline = deadline;
    }

    public String getDeadline() {
        return deadline;
    }

    @Override
    public String getStatus() {
        return super.getStatus() + " (Due: " + deadline + ") [Type: Timed]";
    }
}