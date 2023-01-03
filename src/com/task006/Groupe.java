package com.task006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Groupe implements Voenkom {
    private List<Student> students = new ArrayList<Student>(10);

    public Groupe() {
    }

    public void addStudent(Student student) {
        try {
            for (int i = 0; i < 10; i++) {
                students.add(student);
                System.out.println("student " + students.get(i).getLastName() + " " + students.get(i).getFirstName() + " added to the group.\n");
                break;
            }

            if (students.size() == 10) {
                throw new StudentExcetion();
            }
        } catch (StudentExcetion e) {
            System.out.println(e);
        }
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i) == student) {
                System.out.println("student " + students.get(i).getLastName() + " " + students.get(i).getFirstName() + " удален из группы");
                students.remove(student);
                break;
            }
        }
    }

    public void searchStudent(String lastName) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getLastName().equals(lastName)) {
                System.out.println("Student found!");
                students.get(i).getInfo();
                break;
            } else {
                System.out.println("Student not found!");
                break;
            }
        }
    }

    public void getAllStudents() {
        students.sort(Comparator.comparing(Student::getLastName));
        students.sort(Comparator.comparing(Student::getAge));

        for (Student student : students) {
            student.getInfo();
        }
    }

    public void intercativeAdd() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (int i = 0; i < 10; i++) {
                System.out.println("Enter Last Name, First Name, Age, Course: (Enter course if completed)");
                String line = reader.readLine();
                String[] strings = line.split(" ");

                if (line.equals("exit")) {
                    break;
                } else {
                    students.add(new Student(strings[0], strings[1], Integer.parseInt(strings[2]), Integer.parseInt(strings[3])));
                    System.out.println("student " + students.get(i).getLastName() + " " + students.get(i).getFirstName() + " added to group.\n");
                    Arrays.fill(strings, null);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getRecruitList() {
        for (Student student : students) {
            if (student.getAge() >= 18) {
                System.out.print("Suitable for military service! ");
                student.getInfo();
            }
        }
    }
}