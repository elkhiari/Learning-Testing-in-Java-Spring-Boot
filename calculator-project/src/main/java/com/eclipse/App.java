package com.eclipse;


public class App 
{
    public static void main( String[] args )
    {
        Calculator calc = new Calculator();
        System.out.println("1 + 1 = " + calc.add(1, 1));
        System.out.println("1 - 1 = " + calc.subtract(1, 1));
        System.out.println("1 * 1 = " + calc.multiply(1, 1));
        System.out.println("1 / 1 = " + calc.divide(1, 1));
        System.out.println("1 / 0 = " + calc.divide(1, 0));
    }
}
