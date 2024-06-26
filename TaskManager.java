import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks; // List to store tasks

    // Constructor to initialize the task manager
    public TaskManager() {
        tasks = new ArrayList<>(); // Initialize the list of tasks
    }

    // Method to add a task
    public void addTask(String title, String description) {
        Task task = new Task(title, description); // Create a new task
        tasks.add(task); // Add the task to the list
        System.out.println("Task added successfully."); // Print success message
    }

    // Method to mark a task as completed
    public void markTaskAsCompleted(int id) {
        Task task = findTaskById(id); // Find the task by ID
        if (task != null) {
            task.setCompleted(true); // Mark the task as completed
            System.out.println("Task marked as completed.");
        } else {
            System.out.println("Task not found with ID: " + id);
        }
    }

    // Method to list all tasks
    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            for (Task task : tasks) {
                System.out.println(task); // Print each task
            }
        }
    }

    // Method to delete a task by ID
    public void deleteTask(int id) {
        Task task = findTaskById(id); // Find the task by ID
        if (task != null) {
            tasks.remove(task); // Remove the task from the list
            System.out.println("Task deleted successfully.");
        } else {
            System.out.println("Task not found with ID: " + id);
        }
    }

    // Helper method to find a task by ID
    private Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task; // Return the task if found
            }
        }
        return null; // Return null if not found
    }
}
