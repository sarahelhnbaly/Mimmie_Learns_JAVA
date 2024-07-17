package com.mimmie_learns.java;

import com.mimmie_learns.java.abstracrexample.Circle;
import com.mimmie_learns.java.abstracrexample.Rectangle;
import com.mimmie_learns.java.abstracrexample.Shape;
import com.mimmie_learns.java.abstracrexample.Trapezoid;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Trapezoid(3.0, 4.0, 6.5);
        Shape shape2 = new Rectangle(3.5, 3.5);
        Shape shape3 = new Circle(3.5);

        System.out.println("Trapezoid area: " + shape1.calculateArea());
        System.out.println("Rectangle area: " + shape2.calculateArea());
        System.out.println("Circle area: " + shape3.calculateArea());
    }
}

























