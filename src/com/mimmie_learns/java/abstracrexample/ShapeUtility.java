package com.mimmie_learns.java.abstracrexample;

import com.mimmie_learns.java.interfaces.IShape;

public class ShapeUtility {
    public void calculateArea(Shape shape){
       double area= shape.calculateArea();
       System.out.println("The area is: " + area);


    }
    public void getArea(IShape shape){
        double area = shape.getArea();
        System.out.println("The area is: " + area);
    }
}
