package com.mimmie_learns.java.school;

import com.mimmie_learns.java.pojo.Teacher;

public class TeacherFunction {

    private String name; // if the 'name' is supposed to be property of TeacherFunction class

    public String TeacherFunction(String teacherName) {
        Teacher teacher = new Teacher();
        teacher.setTeacherName(teacherName);
        return teacher.getTeacherName();
    }

    public void teach(String teacherName) {
        this.name = teacherName;
        System.out.println("Teacher " + name + " is teaching.");
    }
}