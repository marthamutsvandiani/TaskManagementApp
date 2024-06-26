import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager(); // Create a TaskManager instance
        Scanner scanner = new Scanner(System.in); // Create a Scanner for user input
        boolean exit = false;

        // Command-line interface loop
        while (!exit) {
            // Display menu options
            System.out.println("Task Management Application");
            System.out.println("1. Add a task");
            System.out.println("2. Mark a task as completed");
            System.out.println("3. List all tasks");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt(); // Get user choice
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1: // Add a task
                    System.out.print("Enter task title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskManager.addTask(title, description);
                    break;
                case 2: // Mark a task as completed
                    System.out.print("Enter task ID to mark as completed: ");
                    int completeId = scanner.nextInt();
                    taskManager.markTaskAsCompleted(completeId);
                    break;
                case 3: // List all tasks
                    taskManager.listTasks();
                    break;
                case 4: // Delete a task
                    System.out.print("Enter task ID to delete: ");
                    int deleteId = scanner.nextInt();
                    taskManager.deleteTask(deleteId);
                    break;
                case 5: // Exit the application
                    exit = true;
                    System.out.println("Exiting the application.");
                    break;
                default: // Handle invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close(); // Close the scanner
    }
}
