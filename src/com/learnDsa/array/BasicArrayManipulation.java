package com.learnDsa.array;

public class BasicArrayManipulation {
    public BasicArrayManipulation() {

    }

    public static void printAllPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("( " + arr[i] + " , " + arr[j] + " )");
            }
        }
    }

    public static void reverseArray(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex < endIndex) {
            arr[startIndex] = arr[startIndex] + arr[endIndex];
            arr[endIndex] = arr[startIndex] - arr[endIndex];
            arr[startIndex] = arr[startIndex] - arr[endIndex];
            startIndex++;
            endIndex--;

        }
    }
}
