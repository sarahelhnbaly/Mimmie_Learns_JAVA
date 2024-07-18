package com.mimmie_learns.java;
import com.mimmie_learns.java.abstracrexample.*;
import com.mimmie_learns.java.interfaces.IShape;
import com.mimmie_learns.java.pojo.Person;

public class Main {
    public static void main(String[] args) {
        Person obj1 = new Person("x",22);
        Person obj2=new Person("Y",23);
        Person obj3=new Person("Z",24);
        Person obj4=new Person("X",25);
        System.out.println(obj1.equals(obj2));

    }
}











