package com.learning.dsa.binarySearch;

public class AutoLoan {
  public double getInterestRate(double price, double monthlyPayment, int loanTerm){
    double low=0.0D,mid,max,balanceLeft;
    max=(monthlyPayment*loanTerm-price)/price;
    if (max == 0) {
      return 0;
    }
    while(Math.abs(max-low)>1e-14){
      mid = low + (max-low)/2;
      balanceLeft=this.getBalancedLeft(mid,price,monthlyPayment,loanTerm);
      if(Math.abs(balanceLeft)<1e-17)
        return mid*100*12;
      if (balanceLeft>0)
        max=mid;
      else
        low=mid;
    }
    return low*100*12;
  }

  private double getBalancedLeft(double rate, double price, double monthlyPayment, int loanTerm){
    while(loanTerm>0){
      price = price*(1+rate)-monthlyPayment;
      loanTerm--;
    }
    return price;
  }
}
