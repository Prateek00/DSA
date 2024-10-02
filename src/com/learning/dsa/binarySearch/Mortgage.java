package com.learning.dsa.binarySearch;

public class Mortgage {
    public int getMonthlyPayment(int loan, int interest, int term){
        int low=0;
        int high=loan;
        int mid;
        int months = term*12;
        while(high>low){
            mid = (low+high)/2;
            if(checkAmount(loan,interest,months,mid)){
                high=mid;
            }
            else{
                low=mid;
            }
        }
        return high;
    }

    public boolean checkAmount(int loan, int interest, int months,int amount){
        double extra;
        while(months>0){
            loan-=amount;
            extra = (double) ((double)loan*interest/1200);
            loan = (int) Math.ceil(loan + extra);
            months--;
        }
        if(loan<=0)
            return true;
        else
            return false;
    }
}
