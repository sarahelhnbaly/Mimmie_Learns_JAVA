package com.mimmie_learns.java.school;

public class Student {
    public Integer studentId;
    public String studentName;

    public Teacher getClassTeacher() {
        Teacher teacher = new Teacher();
        teacher.teach("Sarah");
        return teacher;
    }

}
