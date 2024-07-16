package com.mimmie_learns.java.pojo;

public class Student {
    private int studentId;
    private String studentName;
    private String grade;
    private String assignedTeacherName;

    public Student(int studentId, String studentName, String grade, String assignedTeacherName) {

        if (studentId >100 )
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
        this.assignedTeacherName = assignedTeacherName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getAssignedTeacherName() {
        return assignedTeacherName;
    }

    public void setAssignedTeacherName(String assignedTeacherName) {
        this.assignedTeacherName = assignedTeacherName;
    }
}