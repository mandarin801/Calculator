package com.lisevich;

import java.util.Scanner;

/**
 * Created by mandarin80 on 31.01.17.
 */
public class AverageCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first number:");
        String firstValue = scanner.next();
        while (!isNumeric(firstValue)){
            System.out.println("Wrong Value! Please input first number:");
            firstValue = scanner.next();
        }
        System.out.println("Your input " + firstValue + " as a first number.\n");
        System.out.println("Please input second number:");
        String secondValue = scanner.next();
        while (!isNumeric(secondValue)){
            System.out.println("Wrong Value! Please input second number:");
            secondValue = scanner.next();
        }
        System.out.println("Your input " + secondValue + " as a second number.\n");
        double firstNumber = Double.parseDouble(firstValue);
        double secondNumber = Double.parseDouble(secondValue);
        System.out.println("Average is " + ((firstNumber + secondNumber) / 2));
    }

    private static boolean isNumeric(String str)
    {
        try
        {
            double d = Double.parseDouble(str);
        }
        catch(NumberFormatException e)
        {
            return false;
        }
        return true;
    }
}


