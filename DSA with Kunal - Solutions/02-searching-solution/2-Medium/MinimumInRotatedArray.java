package com.company;
//Question: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

public class MinimumInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
        int pivot = findPivot(nums);
        if(pivot == -1)            //pivot not found, it's not rotated array
            return nums[0];        //the first element will be the minimum

        else
            return nums[pivot+1];   //the element after the pivot will be minimum
    }
    public static int findPivot(int[] nums)
    {
        int start=0;
        int end= nums.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])          //case 1
            {
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1])   //case 2
            {
                return mid-1;
            }
            else if(nums[start]>=nums[mid])                    //case 3
            {
                end=mid-1;
            }
            else if(nums[start]<nums[mid])                     //case 4
            {
                start=mid+1;  //not start= mid, coz if nums[mid] was pivot, it would have been returned in  case 1 and 2
            }
        }
        return -1;
    }
}
