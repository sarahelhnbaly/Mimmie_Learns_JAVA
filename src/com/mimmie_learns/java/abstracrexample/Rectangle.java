package com.mimmie_learns.java.abstracrexample;

public class Rectangle extends Shape {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;

    }
    @Override
    public void calculateArea() {
        double area = base * height;
        System.out.println("Area of Rectangle: " + area);
    }

}