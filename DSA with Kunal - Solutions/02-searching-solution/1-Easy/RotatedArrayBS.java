package com.company;
// Question: https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
public class RotatedArrayBS
{
    public static void main(String[] args) {
        int[] nums ={0,2,3,5,1};
        int target = 5;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target)
    {
        int pivot = findPivot(nums);
        if(pivot == -1)            //pivot not found, it's not rotated array
        {
            return binarySearch(nums, target, 0, nums.length-1);  //perform binary search to search the element
        }
        if(target == nums[pivot])   //if you found pivot, you have 2 ascending sorted arrays
            return pivot;        //if target is equal to the pivot

        if(target>=nums[0])
            return binarySearch(nums, target, 0, pivot-1);  //search before the pivot

        return binarySearch(nums, target,pivot+1, nums.length-1);  //search after the pivot

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
    public static int binarySearch(int[] nums, int target, int start, int end)
    {
        while(start<=end)
        {
            int mid = start+((end-start)/2);
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }
        return -1;
    }
}
