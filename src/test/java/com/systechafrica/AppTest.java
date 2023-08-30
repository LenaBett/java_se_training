package com.systechafrica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AppTest {

    App app = new App();  // create an instance of the class

    @Test
    void addTest() {
        // when
        int result = app.addNumbers(15, 20);
        // then
        int expectedResult = 35;
        // verify
        Assertions.assertEquals(expectedResult, result, "The expected result of 15+20 is" + expectedResult);

    }
}