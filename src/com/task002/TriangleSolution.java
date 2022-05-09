package com.task002;

/**
 * Describe the "Triangle" class. Take the lengths of the sides
 * of the triangle as properties. Implement a method that will
 * return the area of the triangle. Create several objects of
 * this class and test them
 */

public class TriangleSolution {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(12, 12, 12);
        triangle.triangleArea();
    }
}
