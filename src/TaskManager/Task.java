package TaskManager;

import TaskManager.User;

class Task {
    private String title;
    private String description;
    private String dueDate;
    private User assignedUser;
    private boolean completed;

    public Task(String title, String description, String dueDate, User assignedUser) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.assignedUser = assignedUser;
        this.completed = false;
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

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
// Getter and setter methods for task attributes (title, description, dueDate, assignedUser, completed)
}
