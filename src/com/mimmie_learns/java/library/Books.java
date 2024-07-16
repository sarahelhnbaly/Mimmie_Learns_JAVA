package com.mimmie_learns.java.library;

import com.mimmie_learns.java.school.TeacherFunction;

public class Books {
    public String title;
    public String Id;
    public String Author;

    public TeacherFunction bookTeacher(){
        TeacherFunction teacher = new TeacherFunction();
        teacher.teach("Sarah");
        return teacher;
    }
}

    }

}
