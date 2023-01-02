package com.task005;

public class Human {
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
        System.out.print("Last name: " + lastName + " First name: " + firstName + " Age: " + age);
    }
}
