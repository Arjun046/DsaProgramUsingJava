package Task;

import Task.Task;
import Task.TaskManager;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        while (true) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Delete Task");
            System.out.println("4. View All Tasks");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Task Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Task Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Due Date: ");
                    String dueDate = scanner.nextLine();
                    System.out.print("Enter Assigned User: ");
                    String assignedUser = scanner.nextLine();

                    Task task = new Task(title, description, dueDate, assignedUser);
                    taskManager.addTask(task);
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    System.out.print("Enter the index of the task to update: ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (updateIndex >= 0 && updateIndex < taskManager.getAllTasks().size()) {
                        System.out.print("Enter Updated Task Title: ");
                        title = scanner.nextLine();
                        System.out.print("Enter Updated Task Description: ");
                        description = scanner.nextLine();
                        System.out.print("Enter Updated Due Date: ");
                        dueDate = scanner.nextLine();
                        System.out.print("Enter Updated Assigned User: ");
                        assignedUser = scanner.nextLine();

                        Task updatedTask = new Task(title, description, dueDate, assignedUser);
                        taskManager.updateTask(updateIndex, updatedTask);
                        System.out.println("Task updated successfully!");
                    } else {
                        System.out.println("Invalid index. No task found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter the index of the task to delete: ");
                    int deleteIndex = scanner.nextInt();

                    if (deleteIndex >= 0 && deleteIndex < taskManager.getAllTasks().size()) {
                        taskManager.deleteTask(deleteIndex);
                        System.out.println("Task deleted successfully!");
                    } else {
                        System.out.println("Invalid index. No task found.");
                    }
                    break;
                case 4:
                    List<Task> allTasks = taskManager.getAllTasks();
                    if (allTasks.isEmpty()) {
                        System.out.println("No tasks available.");
                    } else {
                        for (int i = 0; i < allTasks.size(); i++) {
                            System.out.println("Task " + i + ":");
                            System.out.println(allTasks.get(i));
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exiting the Task Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}