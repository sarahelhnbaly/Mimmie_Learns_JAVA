package com.mimmie_learns.java.abstracrexample;

public class Circle extends Shape {
    public Circle(double radius) {
    }

    @Override
    public double calculateArea ()  {
        return Math.PI*radius*radius;

    }
}
