package com.learnprogramming.methods;

public class MinutesToYearsAndDays {

    public static void printYearsAndDays(long minutes){
        int year;
        int day;
        long d;
        int yearAndDay = 60*24*365;
        int dayAndHour = 60*24;
        if(minutes<0){
            System.out.println("Invalid Value");
        } else{
            year = (int) minutes/yearAndDay;
            day =  (int) minutes%yearAndDay;
            d =   minutes/dayAndHour;
            System.out.println(d);
            System.out.println(minutes+" min = "+ year+" y and "+ day+" d");
        }

    }
}
