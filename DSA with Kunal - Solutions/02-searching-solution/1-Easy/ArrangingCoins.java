package com.company;
//Question: https://leetcode.com/problems/arranging-coins/
import java.util.Scanner;

public class ArrangingCoins {
    public static int arrangeCoins(int n) {
        long start=1, end=n;
        while(start<=end)
        {
            long k=start+(end-start)/2;
            if(k*(k+1)/2 == n)      //sum from 1 to k, AP
                return (int)k;

            else if(k*(k+1)/2 < n)
                start=k+1;

            else
                end=k-1;
        }
        return (int)end;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long num;
        System.out.println("Enter the number: ");
        num=in.nextLong();
        System.out.println("The value of k: "+ arrangeCoins((int)num));
    }
}
