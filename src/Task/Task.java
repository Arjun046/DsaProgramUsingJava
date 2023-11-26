package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    private String title;
    private String description;
    private String dueDate;
    private String assignedUser;
    private boolean isComplete;

    public Task(String title, String description, String dueDate, String assignedUser) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.assignedUser = assignedUser;
        this.isComplete = false;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getAssignedUser() {
        return assignedUser;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void markComplete() {
        isComplete = true;
    }

    public void markIncomplete() {
        isComplete = false;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDescription: " + description + "\nDue Date: " + dueDate +
                "\nAssigned User: " + assignedUser + "\nStatus: " + (isComplete ? "Complete" : "Incomplete");
    }
}