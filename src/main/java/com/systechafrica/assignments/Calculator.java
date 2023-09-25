package com.systechafrica.assignments;

import com.systechafrica.part1.arrays.WorkingWithArrays;

import java.util.logging.Logger;

public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(WorkingWithArrays.class.getName());

    public static void main(String[] args) {

        int[] numberList = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30};

        for (int i = 0; i < numberList.length; i++) {
            if (i % 2 != 0) { // if [i] is odd then print the value stored in that index
                LOGGER.info("Numbers in the odd positions in the array are: " + numberList[i]);
            }
        }

    }
}
