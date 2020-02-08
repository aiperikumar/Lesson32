package com.company;

public class ThrowsExample {

    public static void main (String[] args){
        try {
            getFactorial(4);
        } catch (FactorialException e) {
            e.printStackTrace();
        }

    }

    public static int getFactorial (int num)  throws FactorialException{
        if (num < 0 ) {
            throw new FactorialException("Ваше число меньше 0", num);
        }
        int result = 1;
        for (int i = 0; i <num ; i++) {
            result *= i;


        }
        return result;

    }
}
