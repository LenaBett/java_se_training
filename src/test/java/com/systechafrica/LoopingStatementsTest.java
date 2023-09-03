package com.systechafrica;

import java.util.logging.Logger;

import com.systechafrica.LoopingStatements.LoopingStatements;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Enumeration;
import java.util.logging.Logger;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class LoopingStatementsTest {
    LoopingStatements app = new LoopingStatements();
    private static final Logger LOGGER = Logger.getLogger(LoopingStatements.class.getName());


    @Test
    public void loopSampleTest(){
        int search = app.search(10);
        LOGGER.info("Search value is: " + search);
        Assertions.assertEquals(10, search);
    }






}