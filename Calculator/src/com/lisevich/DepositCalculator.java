package com.lisevich;

import javax.xml.transform.sax.SAXSource;
import java.math.BigDecimal;
import java.util.Scanner;

import static java.math.BigDecimal.ZERO;

/**
 * Created by mandarin80 on 01.02.17.
 */
public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first deposit:");
        String inputFirstDeposit = scanner.next();
        while (!isDouble(inputFirstDeposit)){
            System.out.println("Wrong Value! Please input first deposit:");
            inputFirstDeposit = scanner.next();
        }
        System.out.println("Please input number of months:");
        String inputNumberOfMonth = scanner.next();
        while (!isInteger(inputNumberOfMonth)){
            System.out.println("Wrong Value! Please input number of months:");
            inputNumberOfMonth = scanner.next();
        }
        Integer numberOfMonth = Integer.parseInt(inputNumberOfMonth);
        System.out.println("Please input percentage:");
        String inputPercentage = scanner.next();
        while (!isInteger(inputPercentage)){
            System.out.println("Wrong Value! Please input Percentage:");
            inputPercentage = scanner.next();
        }
        BigDecimal percentage = BigDecimal.valueOf(Integer.parseInt(inputPercentage));
        BigDecimal deposit = new BigDecimal(Double.parseDouble(inputFirstDeposit));
        BigDecimal sum = ZERO;
        BigDecimal sumOfPercents;
        System.out.println(percentage);
        for (int i = 0; i < numberOfMonth; i++) {
            sum = sum.add(deposit);
        }
        sumOfPercents = sum.multiply(percentage).divide(BigDecimal.valueOf(100), 2, 2);
        System.out.println("Sum of deposit is " + sum);
        System.out.println("Sum of percents is " + sumOfPercents);


    }

    private static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
