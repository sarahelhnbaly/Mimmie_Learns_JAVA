package com.mimmie_learns.java.abstracrexample;


public abstract class Shape {
    public abstract double calculateArea();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}




