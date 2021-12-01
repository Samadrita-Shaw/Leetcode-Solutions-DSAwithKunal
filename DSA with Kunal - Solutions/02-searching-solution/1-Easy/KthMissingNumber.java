package com.company;
//Question: https://leetcode.com/problems/kth-missing-positive-number/

import java.util.Scanner;

public class KthMissingNumber {
    public static int findKthPositive(int[] arr, int k) {
        int start=0, end=arr.length-1,mid;
        while(start<=end)
        {
            mid = start+(end - start)/2;
            if((arr[mid]-1-mid)<k)  //number of elements missing till arr[mid]
            {
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return start+k;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter k: ");
        int k = in.nextInt();

        System.out.println("Value: "+findKthPositive(arr,k));
    }
}
