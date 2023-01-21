package com.task013;

import java.io.File;

public class Solution {
    public static void main(String[] args) {
        File file = new File("a.txt");
        CountingCharsImpl countingChars = new CountingCharsImpl();
        countingChars.getTextCharacters(file);
    }
}