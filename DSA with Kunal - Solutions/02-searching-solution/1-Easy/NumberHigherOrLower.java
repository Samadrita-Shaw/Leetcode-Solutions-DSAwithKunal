package com.company;
// Question: https://leetcode.com/problems/guess-number-higher-or-lower/

public class NumberHigherOrLower
{
    public static void main(String[] args) {

    }
    public static int guessNumber(int n)
    {
        {
            int start = 1, end = n;
            while(start <= end)
            {
                int mid = start + (end-start)/2;
                if(guess(mid)==0)   // if the guessed number == picked number
                    return mid;

                else if(guess(mid)==1)  // if the guessed number is less than the picked number
                    start=mid+1;        // the picked number lies in the second half

                else if(guess(mid)==-1)  //if the guessed number is greater than the picked number
                    end=mid-1;           //// the picked number lies in the first half
            }
            return -1;
        }
    }
    public static int guess(int n)
    {
        return 1;
    }
}
