package com.systechafrica.part3.exceptionhanding;

import java.util.UUID;

public class StudentController {
    public void addStudent (Student student) throws Exception {
        if(student == null){
            throw new StudentDetailsMissingException("Invalid Student Details");

        }

        student.setId(UUID.randomUUID().toString());
    }
}
