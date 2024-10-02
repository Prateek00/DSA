package com.learning.dsa.KadaneAlgo;

public class Kadane {

    
    public int maxSumSubArray(int[] a){
        int max=Integer.MIN_VALUE; // max=a[0]
        int sum=0;
        for (int j : a) {
            sum += j;
            if (sum > max)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
}
