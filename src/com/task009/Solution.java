package com.task009;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] ints = new int[200000000];
        int sumThread = 0;
        int sumDefault = 0;
        long threadTimerStart = System.currentTimeMillis();
        long defaultTimerStart = System.currentTimeMillis();
        Arrays.fill(ints, 1);
        SumThread thread1 = new SumThread(ints, 0, ints.length / 2);
        SumThread thread2 = new SumThread(ints, ints.length / 2, ints.length - 1);
        try {
            thread1.getThread().join();
            thread2.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < ints.length; i++) {
            sumDefault += ints[i];
        }
        sumThread = thread1.getSum() + thread2.getSum();
        System.out.println("Sum of array elements (Streams) = " + sumThread +
                " Time " + (System.currentTimeMillis() - threadTimerStart));
        System.out.println("Sum of array elements (Regular cycle) = " + sumDefault +
                " Time " + (System.currentTimeMillis() - defaultTimerStart));
    }
}