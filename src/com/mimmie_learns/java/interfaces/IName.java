package com.mimmie_learns.java.interfaces;
public interface IName {
    public static final String NAME = "ShapeName" ;

public void printName();
public default String getConstValue() {
    return NAME ;

}


}