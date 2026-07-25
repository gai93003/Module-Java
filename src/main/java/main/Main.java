package main;

import management.TaskManager;
import tasks.PriorityTask;
import tasks.Task;
import tasks.TimedTasked;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager(10);

        Task task1 = new TimedTasked("Submit Java Track Sprint 2 PR", "Friday 5 PM");
        Task task2 = new PriorityTask("Fix critical bug in the backend logic", "High");
        Task task3 = new TimedTasked("Prepare for mock interview", "Next Monday");

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        manager.printAllTaskSummaries();

        System.out.println("\n--- Completing Tasks ---");
        manager.completeTask(1);

        // Demonstrating state protection (cannot completed twice)
        manager.completeTask(1);

        // View Pending vs Completed
        System.out.println("\n--- Pending Tasks ---");
        for (Task t : manager.getTasksByStatus(false)) {
            System.out.println(t.getStatus());
        }

        System.out.println("\n--- Completed Tasks ---");
        for (Task t : manager.getTasksByStatus(true)) {
            System.out.println(t.getStatus());
        }
    }
}