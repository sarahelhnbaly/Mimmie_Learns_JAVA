package com.mimmie_learns.java.abstracrexample;


import com.mimmie_learns.java.interfaces.IShape;

public class Circle implements IShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printName() {
        System.out.println("Circle");

    }
}
