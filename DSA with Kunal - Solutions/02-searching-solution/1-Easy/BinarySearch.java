package com.company;
//Question: https://leetcode.com/problems/binary-search/

public class BinarySearch
{
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target= 5;
        System.out.println(binarySearch(arr, target));
    }
    public static int binarySearch(int[] nums, int target)
    {
        int start=0,end=nums.length-1;
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
