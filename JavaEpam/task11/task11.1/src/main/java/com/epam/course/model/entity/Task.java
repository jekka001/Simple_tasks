package com.epam.course.model.entity;

public class Task {
    private int id;
    private String description;
    private Employee employee;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Task(int id, String description, Employee employee) {
        this.id = id;
        this.description = description;
        this.employee = employee;
    }

    public Task() {
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", employee=" + employee +
                '}';
    }
}
