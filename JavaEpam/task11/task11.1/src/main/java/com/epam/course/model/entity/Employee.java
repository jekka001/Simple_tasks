package com.epam.course.model.entity;

public class Employee {
    private int id;
    private String surName;
    private String name;
    private String position;
    private Department department;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Employee() {
    }

    public Employee(int id, String name, String surName, String position, Department department) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.position = position;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", department=" + department +
                '}';
    }
}
