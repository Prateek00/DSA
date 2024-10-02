package com.learning.dsa.BrianAlgo;

public class Brian {

    // bitwise & of n and n-1 unset rightmost set bit
    public static int findSetBits(int n){
        int count=0;
        while(n > 0){
            n &= n-1;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int input = 11;
        int[] q = new int[10];
        System.out.println("Set bit is " + findSetBits(input));
    }



}
