package com.task007;

import java.io.Serializable;

public class Student extends Human implements Serializable {
    private int course;

    public Student() {
    }

    public Student(String lastName, String firstName, int age, int course) {
        super(lastName, firstName, age);
        this.course = course;
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    public int getCourse() {
        return course;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println(" course " + course + "\n");
    }
}
