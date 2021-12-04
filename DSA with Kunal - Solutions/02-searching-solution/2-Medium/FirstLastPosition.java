package com.company;
//Question: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/

import java.util.Arrays;

public class FirstLastPosition
{
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,9};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));

    }
    public static int[] searchRange(int[] nums, int target)
    {
        int[] ans = {-1,-1};
        // Check first occurrence of target first
        ans[0]= search(nums, target, true);
        if(ans[0]!=-1)
        {
            ans[1]= search(nums, target, false);
        }
        return ans;
    }
    public static int search(int[] nums, int target, boolean findStartIndex)  //returning index
    {
        int start = 0;
        int end = nums.length-1;
        int ans= -1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid]>target)
                end= mid-1;
            else if(nums[mid]<target)
                start= mid+1;
            else
            {
                ans = mid;       //possible answer found
                if(findStartIndex)
                {
                    end= mid-1; //for the starting index
                }
                else
                    start= mid+1;   //for the ending index
            }
        }
        return ans; //returns either the starting(true) or ending(false) index
    }
}