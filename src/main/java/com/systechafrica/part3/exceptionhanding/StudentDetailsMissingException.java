package com.systechafrica.part3.exceptionhanding;

public class StudentDetailsMissingException extends  Exception{

    public StudentDetailsMissingException (String message){
        super(message);
    }
}
