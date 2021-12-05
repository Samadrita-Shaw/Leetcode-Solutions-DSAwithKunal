package com.company;
//Question: https://leetcode.com/problems/find-peak-element/

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {2,3};
        System.out.println(findPeakElement(arr));
    }
    public static int findPeakElement(int[] nums) {
        int start = 0, end = nums.length-1;

        while(start<end)
        {
            int mid = start + (end-start)/2;
            //Case 1: descending order part, peak will definitely be on the left side, mid might be the peak element.
            if(nums[mid]>nums[mid+1])
                end = mid;

            //Case 2: ascending order part or valley region, peak will definitely be on the right side
            else
                start = mid+1;
        }

        return end;     //peak element will be at start position or end position. Can return any of them, since start == end
                        //when condition terminates
    }
}