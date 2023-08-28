package com.systechafrica;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AppTest {
    static int counter = 0;
    // to test the instantiation of the Main class in each method
    static App app;

    @BeforeEach
    void initEach() {
        app = new App();
        System.out.println("An instance of the main class is created before each test");
    }

    @AfterEach
    static int countTests(){
    return counter ++;
    }

    @Test
    void add() {
        // when
        int result = app.addNumbers(15, 20);
        // then
        int expectedResult = 35;

        // verify
        Assertions.assertEquals(expectedResult, result, "The expected result of 15+20 is" + expectedResult);
    }

    @Test
    @Disabled("this test case is skippped")
    void skipTest() {
        System.out.println("This is a skipped test ,should not execute");
    }

    @Test
    void validDataType() {
        Integer result = app.addNumbers(10, 12);

        Integer expectedResult = 22;
        Assertions.assertTrue(result instanceof Integer, "The expected value is not of type Integer");
        Assertions.assertTimeout(Duration.ofSeconds(2), () -> {

            int result1 = app.addNumbers(1000, 1000);
            Assertions.assertEquals(result1, 2000);

        });
    }

    @Test
    void abortedTest() {
        assumeTrue(app.equals(null));
        fail("test should have been aborted");
    }

    // only test allowed to fail
   // @Test
   // void failingTest() {
       // fail("This test must fail");
   // } *still working on this

    @AfterAll
    static void completeTesting() {
        System.out.println(".....Test suite complete......");
    }

    public static void main(String[] args) {
        System.out.println("All "+countTests()+" have been executed !!");
    }
}