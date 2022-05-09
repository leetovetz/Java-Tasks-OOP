package com.task001;

/**
 * Describe the "Sat" class. Provide it with properties and methods.
 * Create several instances of objects of this class. Use these objects
 */

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(7);
        cat.setWeight(10);
        cat.isFat(cat.getWeight());

        Cat cat2 = new Cat("Barsik", "Black", 5, 5);
        cat2.isFat(cat2.getWeight());
        cat2.meov();
    }
}
