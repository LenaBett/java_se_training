package com.systechafrica.part3.exceptionhanding;

public class Calculator {
    public double divide(int a, int b) {
        double result = 0.0;

        try {
            return result = a / b;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public double divide(long a, long b) {
        double result = 0.0;
        return result = a/b;
    }

    public int sum(int a, int b) throws MyCustomException{

        throw new MyCustomException("Method not implemented");
        //Exception e = new MyCustomException("Method not implemented")

    }
}
