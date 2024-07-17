package com.mimmie_learns.java.abstracrexample;


import com.mimmie_learns.java.interfaces.IShape;

public class Rectangle extends Shape implements IShape {
    private double base;
    private double height;
    @Override
    public double getArea() {
        return base*height;
    }


    public Rectangle(double width, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }

    @Override
    public void printName() {
        System.out.println("Rectangle");
    }
}

