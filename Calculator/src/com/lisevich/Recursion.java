package com.lisevich;

/**
 * Created by mandarin80 on 06.02.17.
 */
public class Recursion {
    public static void main(String[] args) {
        final int i = 10;
        prN(i);


    }

    public static void prN(int n){
        if(n == 0) {
            return;
        }
        System.out.println(n + "hello");

        prN(n - 1);
        System.out.println(n);
    }
}
