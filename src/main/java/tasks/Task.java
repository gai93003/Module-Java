package tasks;

public abstract class Task {
    private static int nextId = 1;

    private final int id;
    private String description;
    private boolean completed;

    public Task(String description) {
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description cannot be empty");
        }

        this.id = nextId++;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void complete() {
        if (this.completed) {
            throw new IllegalStateException("Task #" + id + " is already completed!");
        }
        this.completed = true;
    }

    public String getStatus() {
        String state = completed ? "COMPLETED" : "PENDING";
        return String.format("[%s] ID #%d: %s", state, id, description);
    }
}