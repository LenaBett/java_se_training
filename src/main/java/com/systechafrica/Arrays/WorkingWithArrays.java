package com.systechafrica.Arrays;

import java.util.logging.Logger;

public class WorkingWithArrays {
    // Arrays are data structures that store collections of elements of the same type

    private static final Logger LOGGER = Logger.getLogger(WorkingWithArrays.class.getName());

    public void singleDimensionalArray() {
        int[] numbers = {45, 10, 26, 35, 40, 59}; // an array of integer elements

        String[] nickNames = {"Buddy", "Bud", "Lenz"};
        for (int i = 0; i < numbers.length; i++) { // loop to list the elements in the array
            LOGGER.info("" + numbers[i]); // Accessing elements in one dimensional arrays
        }
        LOGGER.info(nickNames[0]);
        LOGGER.info(nickNames[1]);
        LOGGER.info(nickNames[2]);

        // Solution to calculator assignment
        //This will print the odd elements not the elements stored in the odd positions
        //For the correct solution check the Calculator file

        int[] a = {1, 2, 3, 4, 5}; //
        for (int i = 0; i < a.length; i = i + 1) {
            if (a[i] % 2 != 0) {
                LOGGER.info("" + a[i]);
            }

        }
    }

    public void multiDimensionalArray() {
        // Arrays that allow storage of elements in multiple dimensions or dimensions withtin dimensions
        // initialization
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // for the length of multidimensional array we count the number of elements in the parent array
        int length = matrix.length;
        LOGGER.info("The Length of the array is: " + length);
        LOGGER.info("Number 8 => : " + matrix[2][2]); // Accessing array elements

        String[][] matrix3 = new String[3][3];

        int[][] matrix4;

        // ? indicates a multi dimension array with length of 5 and individual arrays with unspecified length
        matrix4 = new int[5][];

        // Adding values to the array
        int[][] matrix2 = new int[3][3]; // ? indicates a multi dimension array with length of 3 that accepts elements of the int type
        //row 1
        matrix2[0][0] = 10;
        matrix2[0][1] = 15;
        //row 2
        matrix2[1][1] = 15;
        matrix2[1][2] = 10;
        //row 3
        matrix2[2][0] = 20;
        matrix2[2][2] = 30;

        //Nested Loop to display Matrix
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                LOGGER.info(matrix2[i][j] + " ");
                System.out.print(matrix2[i][j] + " ");
            }

            LOGGER.info(" \n");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        WorkingWithArrays app = new WorkingWithArrays();
        app.singleDimensionalArray();
        app.multiDimensionalArray();
    }
}

