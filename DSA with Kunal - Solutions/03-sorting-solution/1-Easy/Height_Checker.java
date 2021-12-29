package com.company;
//Question: https://leetcode.com/problems/height-checker/

import java.util.Arrays;

public class Height_Checker {
    public static void main(String[] args) {
        int[] heights = {1,2,3,4,5};

        System.out.println(heightChecker(heights));
    }
    public static int heightChecker(int[] heights) {
        int[] expected=new int[heights.length];
        System.arraycopy(heights, 0, expected, 0, heights.length); //For copying one array to another (can use for loop instead of inbuilt function)

        //sorting through insertion sort
        for(int i=0; i< expected.length-1; i++)     //here, we can definitely use Arrays.sort(), but since it's a sorting assignment question, I have used a sorting technique
        {
            for (int j = i+1; j >0 ; j--) {
                if(expected[j]<expected[j-1])
                {
                    swap(expected, j, j-1);
                }
                else
                    break;
            }
        }

        //checking for mismatched height order
        int c=0;
        for(int index=0; index< heights.length; index++ )
        {
            if(heights[index]!=expected[index])
                c++;
        }
        return c;
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}