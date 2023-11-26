package TaskManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManagementSystem {
    private List<User> users;
    private List<Task> tasks;

    public TaskManagementSystem() {
        users = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public void registerUser(String username, String password) {
        User user = new User(username, password);
        users.add(user);
        System.out.println("User registered successfully.");
    }

    public User loginUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login successful.");
                return user;
            }
        }
        System.out.println("Login failed. Invalid username or password.");
        return null;
    }

    public void createTask(String title, String description, String dueDate, User assignedUser) {
        Task task = new Task(title, description, dueDate, assignedUser);
        tasks.add(task);
        System.out.println("Task created successfully.");
    }

    public void updateTask(Task task, String newTitle, String newDescription, String newDueDate, User newAssignedUser) {
        task.setTitle(newTitle);
        task.setDescription(newDescription);
        task.setDueDate(newDueDate);
        task.setAssignedUser(newAssignedUser);
        System.out.println("Task updated successfully.");
    }

    public void markTaskComplete(Task task) {
        task.setCompleted(true);
        System.out.println("Task marked as complete.");
    }

    public void markTaskIncomplete(Task task) {
        task.setCompleted(false);
        System.out.println("Task marked as incomplete.");
    }

    public void deleteTask(Task task) {
        tasks.remove(task);
        System.out.println("Task deleted successfully.");
    }

    public List<Task> searchTasks(String keyword) {
        List<Task> matchingTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getTitle().contains(keyword) || task.getDescription().contains(keyword)
                    || task.getAssignedUser().getUsername().contains(keyword)) {
                matchingTasks.add(task);
            }
        }
        return matchingTasks;
    }

    public List<Task> filterTasks(boolean completed, String dueDate) {
        List<Task> filteredTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.isCompleted() == completed && task.getDueDate().equals(dueDate)) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    public static void main(String[] args) {
        TaskManagementSystem system = new TaskManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display a menu for user actions (registration, login, task management, search, filter)
            System.out.println("Task Management System Menu:");
            System.out.println("1. Register User");
            System.out.println("2. Login");
            System.out.println("3. Create Task");
            System.out.println("4. Update Task");
            System.out.println("5. Mark Task Complete");
            System.out.println("6. Mark Task Incomplete");
            System.out.println("7. Delete Task");
            System.out.println("8. Search Tasks");
            System.out.println("9. Filter Tasks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String regUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String regPassword = scanner.nextLine();
                    system.registerUser(regUsername, regPassword);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String loginUsername = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String loginPassword = scanner.nextLine();
                    User loggedInUser = system.loginUser(loginUsername, loginPassword);
                    // Implement user session handling here if needed
                    break;
                case 3:
                    // Implement task creation
                    break;
                case 4:
                    // Implement task update
                    break;
                case 5:
                    // Implement marking task as complete
                    break;
                case 6:
                    // Implement marking task as incomplete
                    break;
                case 7:
                    // Implement task deletion
                    break;
                case 8:
                    // Implement task search
                    break;
                case 9:
                    // Implement task filtering
                    break;
                case 0:
                    System.out.println("Exiting the Task Management System.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}