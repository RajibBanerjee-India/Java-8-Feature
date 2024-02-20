package com.rajib.lambda.demo;

@FunctionalInterface // Any interface has only one abstract method, called functional interface
interface Calculator {

    // void switchOn();

    // void sum(int input);

    int subtract(int i1, int i2);
}

public class CalculatorImpl {

    public static void main(String[] args) {
        /*com.rajib.lambda.demo.Calculator calculator = () -> System.out.println("Switch On.");
        calculator.switchOn();*/

        /*com.rajib.lambda.demo.Calculator calculator = (input) -> System.out.println("Sum : " + input);
        calculator.sum(67);*/

        Calculator calculator = (i1, i2) -> {
            if (i2 < i1) {
                throw new RuntimeException("Second input is smaller than First input");
            } else {
                return i2 - i1;
            }
        };

        System.out.println(calculator.subtract(23, 56));
    }

}
