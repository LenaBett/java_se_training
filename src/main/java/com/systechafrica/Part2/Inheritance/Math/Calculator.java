package com.systechafrica.Part2.Inheritance.Math;

public class Calculator {
    public int sum(int a, int b){
        return a + b;
    }

    public int sum (int a, int b, int c){ //different number of parameters
        return a + b + c;
    }

    public long sum(long a, long b){ // different data type
        return (a + b);
    }

    public long sum(int a, long b){ // parameters with different data types
        return a + b;
    }

    public long sum(long a, int b){ // parameters with different data types in a different sequence
        return a + b;
    }

    // modifying access modifier
    protected double sum(double a, double b) {
        return a + b;
    }
}
