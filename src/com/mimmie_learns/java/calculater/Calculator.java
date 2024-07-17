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

    public int add(int value1, int value2 ){
        System.out.println(value1+value2);
        return value1 + value2;


    }
public double add(double value1, int value2 ){
        System.out.println(value1+value2);
        return value1 + value2;
}
    public int add(int value1, int value2, int value3){
       System.out.println(value1+value2+value3);
        return value1 + value2+value3





