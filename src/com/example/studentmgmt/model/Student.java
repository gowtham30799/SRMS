package com.example.studentmgmt.model;

public class Student {
    private int id;
    private String name;
    private String email;
    private String course;
    private double gpa;

    public Student() {}

    public Student(int id, String name, String email, String course, double gpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.gpa = gpa;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }
    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}