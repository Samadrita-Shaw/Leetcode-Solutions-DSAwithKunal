package com.company;

//Question: https://leetcode.com/problems/guess-number-higher-or-lower/submissions/

public class GuessHigherOrLower {
    public int guessNumber(int n) {

        int start=1, end=n;
        while(start<=end){
            int mid=start+(end-start)/2;

            if(guess(mid)==0)
                return mid;

            else if(guess(mid)==-1)
                end=mid-1;

            else if(guess(mid)==1)
                start=mid+1;
        }
        return -1;
    }
}
