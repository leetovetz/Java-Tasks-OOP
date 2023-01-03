package com.task006;

public class StudentExcetion extends Exception {
    @Override
    public String getMessage() {
        return "Cannot add a student";
    }
}
