package com.mimmie_learns.java.pojo;

public class NonTeachingStaff extends Employee{
    private String role;
    // other fields...

    // getter and setter for role
    public void setRole(String role){
        this.role = role;
    }

    public String getRole(){
        return this.role;
    }
    // other methods...
}