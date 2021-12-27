package com.company;
//Question: https://leetcode.com/problems/find-the-duplicate-number/

public class Find_Duplicate
{
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if(nums[i]!=i+1)    //if the element is not already in its correct position
            {
                int correct = nums[i] - 1; //supposed correct index
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            }
            else
                i++;
        }
        return -1;
    }

        public static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
}