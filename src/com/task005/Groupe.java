package com.task005;

import java.util.Arrays;
import java.util.Comparator;

public class Groupe {
    private Student[] students = new Student[10];
    private int countStudents = 0;

    public Groupe() {
    }

    public void addStudent(Student student) {
        try {
            for (int i = 0; i < students.length; i++) {
                if (students[i] == null) {
                    students[i] = student;
                    System.out.println("Student " + student.getLastName() + " " + student.getFirstName() + " added to group.\n");
                    countStudents++;
                    break;
                }

                if (countStudents == students.length)
                    throw new StudentExcetion();
            }
        } catch (StudentExcetion e) {
            System.out.println(e);
        }
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == student) {
                System.out.println("Student " + student.getLastName() + " " + student.getFirstName() + "removed from group");
                students[i] = null;
                countStudents--;
                break;
            }
        }
    }

    public void searchStudent(String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getLastName().equals(lastName)) {
                System.out.println("Student found!");
                students[i].getInfo();
                break;
            } else {
                System.out.println("Student not found!");
                break;
            }
        }
    }

    public void getAllStudents() {
        Arrays.sort(students, Comparator.comparing(Student::getLastName));
        for (Student student : students) {
            student.getInfo();
        }
    }
}
