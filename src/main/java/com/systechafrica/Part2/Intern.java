package com.systechafrica.Part2;

import com.systechafrica.LoopingStatements.LoopingStatements;

import java.util.logging.Logger;

public class Intern {

    private static final  Logger LOGGER = Logger.getLogger(Intern.class.getName());
    String name;
    String phoneNumber;
    String email;

    public void attendClass(){
        LOGGER.info("Attended Class");
    }

    public void doAssignment(){
        LOGGER.info("Do assignment");
    }
}
