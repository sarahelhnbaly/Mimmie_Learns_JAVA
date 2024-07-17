package com.mimmie_learns.java.pojo;

public class Teacher extends Employee{
    private String teachingSubject;
    private String name;

    @Override
    public void workHour(int hours) {
        System.out.println("Teacher work hour: " + hours);
    }

    public String getTeachingSubject() {
        System.out.println("Teacher teaching subject");
        return "Your teaching subject is: " + teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    public String getTeacherName() {
        return name;
    }

    public void setTeacherName(String name) {
        this.name = name;
    }

    public void teach() {
        System.out.println("Teacher " + name + " is teaching.");
    }
}







