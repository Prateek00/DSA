package com.learning.dsa.slidingWindow;

public class BasicSlidingWindowProblem extends Thread {
    //https://leetcode.com/problems/longest-substring-without-repeating-characters/
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0;
        int result=0;
        int currentLength;
        int len=s.length();
        while(j<len){
            for(int k=i;k<j;k++){
                if(s.charAt(k)==s.charAt(j)){
                    i=k+1;
                    break;
                }
            }
            currentLength=j-i+1;
            if(currentLength>result){
                result=currentLength;
            }
            j++;
        }
        return result;
    }
}
