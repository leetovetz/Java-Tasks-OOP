package com.task001;

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(7);
        cat.setWeight(10);
        cat.isFat(cat.getWeight());

        Cat cat2 = new Cat("Barsik", "Blsck", 5, 5);
        cat2.isFat(cat2.getWeight());
        cat2.meov();
    }
}
