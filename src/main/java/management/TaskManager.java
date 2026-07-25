package management;

import tasks.Task;

public class TaskManager {
    private final Task[] tasks;
    private int taskCount;

    public TaskManager(int capacity) {
        this.tasks = new Task[capacity];
        this.taskCount = 0;
    }

    public void addTask(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("Cannot add a null task");
        }
        if (taskCount >= tasks.length) {
            System.out.println("Warning: Cannot add task. Task manager is full!");
            return;
        }

        tasks[taskCount] = task;
        taskCount++;
    }

    public boolean completeTask(int id) {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getId() == id) {
                try {
                    tasks[i].complete();
                    System.out.println("Successfully completed task #" + id);
                    return true;
                }
                catch (IllegalStateException e) {
                    System.out.println("Error: " + e.getMessage());
                    return false;
                }
            }
        }
        System.out.println("Error: Task #" + id + " not found.");
        return false;
    }

    public Task[] getTasksByStatus(boolean completed) {
        int count = 0;
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].isCompleted() == completed) {
                count++;
            }
        }

        Task[] result = new Task[count];
        int index = 0;
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].isCompleted() == completed) {
                result[index++] = tasks[i];
            }
        }
        return result;
    }

    public void printAllTaskSummaries() {
        System.out.println("\n--- All Task Summaries ---");

        for (int i = 0; i < taskCount; i++) {
            System.out.println(tasks[i].getStatus());
        }
    }
}