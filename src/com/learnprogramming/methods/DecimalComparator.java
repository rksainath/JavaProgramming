package com.learnprogramming.methods;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double a, double b){
        int convertA = (int)(a * 1000);
        int convertB = (int)(b * 1000);
        System.out.println(convertA);
        System.out.println(convertB);
        if(convertA == convertB){
            return true;
        }else{
            return false;
        }
    }
}
