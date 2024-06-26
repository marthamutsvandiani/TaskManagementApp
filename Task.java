public class Task {
    private static int nextId = 1; // Static counter for generating unique IDs
    private int id; // Task ID
    private String title; // Task title
    private String description; // Task description
    private boolean completed; // Completion status

    // Constructor to initialize a task with title and description
    public Task(String title, String description) {
        this.id = nextId++; // Assign a unique ID and increment the counter
        this.title = title;
        this.description = description;
        this.completed = false; // Task is initially not completed
    }

    // Getters and setters for task attributes
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        String status = completed ? "[X]" : "[ ]";
        return status + " ID: " + id + ", Title: " + title + ", Description: " + description;
    }
}
