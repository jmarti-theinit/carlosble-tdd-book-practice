package com.theinit.tddpractice.carlosble.calculator;

/**
 * Created by INIT SERVICES on 11/9/16.
 */
public class Calculator {

    public static final int ADD = 1;
    public static final int SUBSTRACT = 2;

    public Calculator() {
    }


    public int add(int operand1, int operand2)  {
        int result = operand1 + operand2;
        return result;
    }

    public int substract(int operand1, int operand2) {
        int result = operand1 - operand2;
        return result;
    }


}

