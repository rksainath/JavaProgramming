package com.learnprogramming.methods;

public class TeenNumberChecker {

    public static boolean hasTeen(int A, int B, int C){
        if(A>=13 && A<=19){
             return true;
        } else if (B>=13 && B<=19){
            return true;
        } else if(C>=13 && C<=19){
            return true;
        } else{
            return false;
        }


    }

    public static boolean isTeen(int A){
        if(A>=13 && A<=19){
            return true;
        } else{
            return false;
        }

    }
}
