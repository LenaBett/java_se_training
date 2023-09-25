package com.systechafrica.part3.exceptionhanding;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            double result = calculator.divide(6L, 0);
            System.out.println(result);
            try {
                calculator.divide(0,0);
            }catch(NullPointerException e){
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            calculator.sum(2,2);
        }catch (MyCustomException e){
            System.out.println(e.getMessage());
        }
    }

}
