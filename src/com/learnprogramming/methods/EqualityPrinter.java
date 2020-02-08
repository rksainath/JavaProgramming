package com.learnprogramming.methods;

public class EqualityPrinter {
    public static void printEqual(int A, int B, int C) {

        if (A < 0 || B < 0 || C < 0) {
            System.out.println("Invalid Value");
        } else if (A == B && A == C && B == C) {
            System.out.println("All numbers are equal");
        }else if (A != B && A != C && B != C) {
            System.out.println("All numbers are different");
        } else{
            System.out.println("Neither all are equal or different");
        }

    }
}
