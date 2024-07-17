package com.mimmie_learns.java.calculater;

public class Calculator {
    public Calculator(){
        System.out.println("This is Calculator");
    }

    public Calculator(int a){
        System.out.println("This is another constructor");
    }

    public Calculator(double c){
        System.out.println("This is yet another constructor");
    }

    public int add(int value1, int value2) {
        int sum = value1 + value2;
        System.out.println("Sum: " + sum);
        return sum;
    }

    public double add(double value1, int value2) {
        double sum = value1 + value2;
        System.out.println("Sum: " + sum);
        return sum;
    }

    public int add(int value1, int value2, int value3) {
        int sum = value1 + value2 + value3;
        System.out.println("Sum: " + sum);
        return sum;
    }
}
