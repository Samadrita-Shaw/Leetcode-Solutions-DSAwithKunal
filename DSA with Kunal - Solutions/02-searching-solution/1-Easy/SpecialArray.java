package com.company;
//Question: https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/submissions/

import java.util.Arrays;
public class SpecialArray {
    public static void main(String[] args) {
        int[] arr = {0,4,3,0,4};
        System.out.println(specialArray(arr));
    }
    public static int specialArray(int[] nums) {

        int start = 1; //The minimum answer possible = 1, if the element exits.
        int end = nums.length; //The maximum answer possible is the total number of elements/ the size of array

        while(start <= end){
            int mid = start + (end-start)/2;

            if(count(nums, mid) == mid){    // answer found
                return mid;
            }
            else if(count(nums, mid) > mid){    // if the number of elements is greater than the index
                start = mid+1;                  //search in second half
            }
            else{                       // if the number of elements is less than the index
                end = mid - 1;          //search in second half
            }
        }

        return -1;      // if no answer found
    }

    // to count number of elements in the array greater than or equal to target index
    public static int count(int[] nums, int target){
        int c = 0;
        for(int n : nums){
            if (n >= target){
                c++;
            }
        }

        return c;

    }
}
