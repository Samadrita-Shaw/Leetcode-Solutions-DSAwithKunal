package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int start=0, end = numbers.length-1;
        while(start<=end)
        {
            if(numbers[start]+numbers[end]==target)
                return new int[] {start+1,end+1};

            else if(numbers[start]+numbers[end]<target)
            start++;

            else
                end--;
            }
        return new int[] {-1,-1};
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];
        int target = 9;
        System.out.println("Enter Array elements: ");
        for(int i=0; i<5; i++)
        {
            num[i]=in.nextInt();
        }
        int[] ind = new int[2];
        ind = twoSum(num, target);
        System.out.println(Arrays.toString(ind));
    }
}
