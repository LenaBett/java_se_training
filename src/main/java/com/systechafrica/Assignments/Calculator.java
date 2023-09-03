package com.systechafrica.Assignments;

import com.systechafrica.Arrays.WorkingWithArrays;

import java.util.logging.Logger;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(WorkingWithArrays.class.getName());

    public void main() {

        int[] numberList = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        for (int i = 0; i < numberList.length; i++) {
            if (numberList[i] % 2 != 0) {
                LOGGER.info("" + numberList[i]);
            }
        }

    }
}
