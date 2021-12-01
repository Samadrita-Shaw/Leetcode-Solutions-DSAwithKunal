package com.company;
//Question: https://leetcode.com/problems/search-insert-position/

public class InsertPos {
    public static int searchInsert(int[] nums, int target) {
        int start=0, end= nums.length-1;
        if(nums[0]>target)      //if the target element is less than the first array element
            return 0;

        else if(nums[end]<target)   //if the target element is greater than the last array element
            return nums.length;

        else{                       //if the target range is in between the array
            while(start<=end)
            {
                int mid = start+(end-start)/2;
                if(nums[mid]==target)
                    return mid;

                else if(nums[mid]<target)
                    start = mid+1;
                else
                    end = mid-1;
            }
            return start;
        }
    }

    public static void main(String[] args) {
        int target = 2;
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,target));
    }
}
