package com.mimmie_learns.java;
import com.mimmie_learns.java.abstracrexample.*;
import com.mimmie_learns.java.interfaces.IShape;

public class Main {
    public static void main(String[] args) {
        IShape shape1 = new Circle(3.5);
        Shape shape2 = new Rectangle(3.5, 3.5);
        IShape shape22 = new Rectangle(3,5);
        Shape shape3 = new Trapedzoid(3.0, 4.0, 6.5);


        ShapeUtility util = new ShapeUtility();
        util.getArea(shape1);
        shape1.printName();
        shape22.printName();
        shape1.printName();
        util.getArea(shape22);
        util.calculateArea(shape2);
        System.out.println(shape1.toString());
        util.calculateArea(shape3);

        System.out.println("Circle area: " + shape1.getArea());
        System.out.println("Rectangle area: " + shape2.calculateArea());
        System.out.println("Trapezoid area: " + shape3.calculateArea());
    }
}











