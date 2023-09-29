package com.systechafrica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.mockito.Mockito.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS) //? This is the default instance
public class PosTest {

    Scanner scanner = Mockito.mock(Scanner.class);

    App app = new App(scanner);  // create an instance of the clas

    @Test
    void addTest() {
        // when
        int result = app.addNumbers(15, 20);
        // then
        int expectedResult = 35;
        //verify
        Assertions.assertEquals(expectedResult, result, "The expected result of 15+20 is" + expectedResult);

    }

    @Test
    void multiplyTest(){
        // when
        int score = app.multiplyNumbers(15, 4);
        // then
        int expectedResult = 60;
        // verify
        Assertions.assertEquals(expectedResult, score, "The Score is" + expectedResult);
    }

    @Test
    void loginTest(){
        var appSpy = Mockito.spy(app);

        when(scanner.nextLine()).thenReturn("Admin123");

        appSpy.userLogin();

        verify(appSpy, times(1)).homeScreen();

    }

    @Test
    void loginTest2(){

        var appSpy = Mockito.spy(app);

        when(scanner.nextLine()).thenReturn("Admin12")
                .thenReturn("Admin12")
                .thenReturn("Admin12");

        appSpy.userLogin();

        verify(appSpy, times(0)).homeScreen();

    }
}