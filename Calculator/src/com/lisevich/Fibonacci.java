package com.lisevich;



import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by mandarin80 on 08.02.17.
 */
public class Fibonacci {
    public static void main(String[] args) {
        /*BigInteger fibonacci = BigInteger.valueOf(0);*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input limit");
        int limit = scanner.nextInt() - 1;

        recursion(limit, BigInteger.ZERO, BigInteger.ONE);

    }

    public static void recursion(int limit, BigInteger first, BigInteger second) {
        BigInteger result = second;
        if (limit == 0) {
            System.out.println(result);
            return;
        }
        result = result.add(first);
        recursion(limit - 1, second, result);
    }
}
