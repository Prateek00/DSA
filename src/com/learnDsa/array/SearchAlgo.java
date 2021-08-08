package com.learnDsa.array;

public class SearchAlgo {
    public SearchAlgo() {

    }

    public static int binarySearch(int[] arr, int key) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int midIndex;
        while (startIndex <= endIndex){
            midIndex = (startIndex+endIndex)/2;
            if(key == arr[midIndex])
                return midIndex;
            else if(key > arr[midIndex]){
                startIndex = midIndex + 1;
            }
            else {
                endIndex = midIndex-1;
            }
        }

        return -1;
    }

    public static boolean linearSearch(int[] arr, int key) {
        for (int x : arr) {
            if (x == key)
                return true;
        }
        return false;
    }
}
