package com.mimmie_learns.java.abstracrexample;

public abstract class Shape {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public abstract void calculateArea();

    }

