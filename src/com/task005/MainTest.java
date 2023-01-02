package com.task005;

import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
        Student student1 = new Student("Ivanov", "Ivan", 20, 4);
        Student student2 = new Student("Ivanov", "Ivan", 20, 4);
        Student student3 = new Student("Uvanov", "Ivan", 20, 4);
        Student student4 = new Student("Kvanov", "Ivan", 20, 4);
        Student student5 = new Student("Evanov", "Ivan", 20, 4);
        Student student6 = new Student("Nvanov", "Ivan", 20, 4);
        Student student7 = new Student("Gvanov", "Ivan", 20, 4);
        Student student8 = new Student("Shvanov", "Ivan", 20, 4);
        Student student9 = new Student("Fvanov", "Ivan", 20, 4);
        Student student10 = new Student("Ivan", "Ivan", 20, 4);
        Student student11 = new Student("Vvanov", "Ivan", 20, 4);

        Groupe groupe = new Groupe();

//        student.getInfo();
//        student1.getInfo();
//        groupe.removeStudent(student1);

        groupe.addStudent(student1);
        groupe.addStudent(student2);
        groupe.addStudent(student3);
        groupe.addStudent(student4);
        groupe.addStudent(student5);
        groupe.addStudent(student6);
        groupe.addStudent(student7);
        groupe.addStudent(student8);
        groupe.addStudent(student9);
        groupe.addStudent(student10);
        groupe.addStudent(student11);

        groupe.searchStudent("Ivanov");
        groupe.searchStudent("Ivanov2");


        groupe.getAllStudents();

    }
}
