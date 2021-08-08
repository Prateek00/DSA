package com.learnDsa.array;

public class BasicArrayManipulation {
    public BasicArrayManipulation() {

    }


    // By kadane's algorithm
    public static int getSubArrayMaxByKadane(int[] arr){
        int currentSum=0;
        int largestSum= Integer.MIN_VALUE;
        for(int x:arr){
            currentSum+=x;
            if(currentSum < 0){
                currentSum=0;
            }
            largestSum = largestSum>currentSum ? largestSum : currentSum;
        }
        return largestSum;
    }

    //By prefix sum logic, O(n^2)
    public static int getSubArrayMaxSumByPrefix(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        int maxSum=Integer.MIN_VALUE;
        int tempSum=0;
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                tempSum = i>0 ? prefixSum[j]-prefixSum[i-1]:prefixSum[j];
                if(tempSum>maxSum)
                    maxSum=tempSum;
            }
        }
        return maxSum;

    }


    // brute force O^3
    public static int getSubArrayMaxSumByBruteForce(int[] arr) {
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                temp = 0;
                for (int k = i; k <= j; k++) {
                    temp += arr[k];
                }
                if (temp > max)
                    max = temp;
            }
        }

        return max;
    }


    // O(n^3)
    public static void printSubArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                System.out.print('(');
                for (int k = i; k <= j; k++) {
                    if (k == j) {
                        System.out.print(arr[k] + ")");
                    } else {
                        System.out.print(arr[k] + ",");
                    }

                }
                System.out.println();
            }
        }
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
