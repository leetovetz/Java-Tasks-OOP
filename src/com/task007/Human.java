package com.task007;

import java.io.Serializable;

public class Human implements Serializable {
    private String firstName;
    private String lastName;
    private int age;

    public Human() {
    }

    public Human(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void getInfo() {
        System.out.print("lastName: " + lastName + " firstName: " + firstName + " age: " + age);
    }
}