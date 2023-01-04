package com.task007;

public class MainTest {
    public static void main(String[] args) {
        Groupe groupe = new Groupe();
        groupe.intercativeAdd();
//        groupe.getAllStudents();
//        groupe.getRecruitList();
        groupe.addToFile();
        groupe.readFromFile();

//Ivanov Ivan 20 2
// Ivan Ivanov 24 3
// Ivan Ivanov 17 1
//Vvanov Ivan 23 5
//Pvanov Ivan 17 4
    }
}
