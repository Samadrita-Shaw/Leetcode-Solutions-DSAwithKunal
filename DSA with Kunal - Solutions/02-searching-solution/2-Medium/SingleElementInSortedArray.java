package com.company;
//Question: https://leetcode.com/problems/single-element-in-a-sorted-array/
//Reference: https://www.youtube.com/watch?v=nMGL2vlyJk0

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));

    }
    public static int singleNonDuplicate(int[] nums) {
        int start=0, end = nums.length-1;
        //Boundary Conditions
        if(end==0)      //if there is only one element
            return nums[0];

        if(nums[0]!=nums[1])    //if the first element is the single element
            return nums[0];

        if(nums[end]!=nums[end-1])  //if the last element is the single element
            return nums[end];

        //If Boundary Conditions don't satisfy
        while (start<=end)
        {
            int mid= start + (end-start)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
                return nums[mid];

            //Idea: If Single element is not encountered/single element is on the right side of mid,
            //The duplicate elements will start at even index and end at odd index
            else if(((mid%2==0) && nums[mid]==nums[mid+1]) || ((mid%2==1) && nums[mid]==nums[mid-1]))
                start = mid+1;      //search in the right half

            else
                end = mid-1;    //search in the left half, bcz once the single element is encountered,
                                // the duplicate elements start on the odd index
        }
        return -1;
    }
}
