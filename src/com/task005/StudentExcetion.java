package com.task005;

public class StudentExcetion extends Exception {
    @Override
    public String getMessage() {
        return "Can't add a student";
    }
}