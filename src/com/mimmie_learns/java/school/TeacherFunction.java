package com.mimmie_learns.java.school;

import com.mimmie_learns.java.pojo.Teacher;

public class TeacherFunction {
    public String TeacherFunction(String TeacherName) {
        Teacher teacher = new Teacher();
        teacher.setTeacherName(teacherName);
        return teacher.getTeacherName();
    }

    public void teach(String teacherName) {
        this.name = teacherName;
        System.out.println("Teacher " + name + " is teaching.");
    }
}
