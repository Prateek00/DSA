package com.learnDsa.array;

public class SearchAlgo {
    public SearchAlgo(){

    }

    public static boolean linearSearch(int[] arr, int key){
        for(int x : arr){
            if(x==key)
                return true;
        }
        return false;
    }
}
