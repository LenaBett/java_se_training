package com.systechafrica.part3.jdbc;

import java.time.LocalDate;

public class Task {
    private int id;
    private String title;
    private LocalDate startDate;
    private LocalDate dueDate;
    private int status;
    private int priority;
    private String description;

    public Task(int id, String title, LocalDate startDate, LocalDate dueDate, int status, int priority, String description) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.dueDate = dueDate;
        this.status = status;
        this.priority = priority;
        this.description = description;
    }

    public Task() {
    }

    public Task(String title, LocalDate startDate, LocalDate dueDate, int taskStatus, int taskPriority, String taskDescription) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate start_date) {
        this.startDate = startDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDue_date(LocalDate due_date) {
        this.dueDate = dueDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", start_date='" + startDate + '\'' +
                ", due_date='" + dueDate + '\'' +
                ", status=" + status +
                ", priority=" + priority +
                ", description='" + description + '\'' +
                '}';
    }
}
