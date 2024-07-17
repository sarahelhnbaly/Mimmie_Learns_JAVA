package com.mimmie_learns.java.pojo;

package com.mimmie_learns.java.pojo;

public class Teacher extends Employee{
    private String teachingSubject;

     @Override
    public void workHour(int hours) {
        System.out.println("Teacher work hour: " + hours);
    }

    public String getTeachingSubject() {
        System.out.println("Teacher teaching subject");
        return "Your teaching subject is: " + teachingSubject;
    }

    // Suggested to add a setter for teachingSubject
    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }
}








