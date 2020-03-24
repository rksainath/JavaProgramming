package com.learnprogramming.controlflow;

public class sumOdd {

    public static boolean isOdd(int number){
        if(number>0){
            if(number%2!=0){
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }

    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        boolean oddNum;
        if(end>=start && start>0 && end>0){
            for(int i=start; i<=end; i++){
                oddNum= isOdd(i);
                if(oddNum){
                    sum = sum + i;
                }
            }
            return sum;

        }else {
            return -1;
        }

    }
}
