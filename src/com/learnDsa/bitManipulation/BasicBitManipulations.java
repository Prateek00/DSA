package com.learnDsa.bitManipulation;

public class BasicBitManipulations {

    public static void getTest(){
        int x=0;
        System.out.println(~x);
    }

    // iterating each bit O(log n)
    public static int getSetBitsCount(int key){
        int count=0;
        while(key != 0){
            count+=(key&1);
            key = key>>1;
        }
        return count;
    }

}
