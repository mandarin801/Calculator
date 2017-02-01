package com.lisevich;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Created by mandarin80 on 31.01.17.
 */
public class AverageMultyCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount of numbers: ");
        int amountOfNumbers = 0;
        String inputAmount = null;
        Double Sum = 0.0;
        String inputValue = null;
        inputAmount = scanner.next();
        while (!isNumeric(inputAmount)){
            System.out.println("Wrong Value! Please input amount of numbers:");
            inputAmount = scanner.next();
        }
        amountOfNumbers = (int)Double.parseDouble(inputAmount);
        for (int i = 0; i < amountOfNumbers; i++){
            System.out.println("Input number: ");
            inputValue = scanner.next();
            while (!isNumeric(inputValue)){
                System.out.println("Wrong Value! Please input number:");
                inputValue = scanner.next();
            }
            Sum = Sum + Double.parseDouble(inputValue);

        }
        System.out.println(Sum/amountOfNumbers);
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
