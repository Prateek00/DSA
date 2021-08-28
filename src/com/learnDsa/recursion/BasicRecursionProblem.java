package com.learnDsa.recursion;

public class BasicRecursionProblem {
    // time complexity O(n) and space complexity O(n)
    private static String[] spell = new String[]{"zero","one","two","three"
    ,"four","five","six","seven","eight","nine"};

    public static int getFactorial(int n){
        //termination case
        if(n==0){
            return 1;
        }
        // splitting into sub-problem
        return n*getFactorial(n-1);
    }

    // time complexity O(2^n) and space complexity is O(n)
    public static int getNthFibonacciNumber(int n){
        // termination cases
        if( n==0 || n==1)
            return n;

        // splitting the sub-problem
        return getFactorial(n-1) + getFactorial(n-2);
    }

    public static boolean isSorted(int[]a,int size){
        if(size <= 1 )
            return true;
        boolean b1 = a[size-1] > a[size-2];
        if(b1)
            return b1 && isSorted(a,size-1);
        else
            return false;
    }
    public static void printDescendingOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.println(n);
        printDescendingOrder(n-1);
    }

    public static void printAscendingOrder(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printAscendingOrder(n-1);
        System.out.println(n);
    }

    public static int getPower(int n, int m){
        if(m==0)
            return 1;
        return n*getPower(n,m-1);
    }

    public static void printSpiralSpell(int n){
        if(n==0){
            return;
        }
        printSpiralSpell(n/10);
        int lastdigit = n%10;
        System.out.print(spell[lastdigit]);
        System.out.print(" ");

    }










    
}
