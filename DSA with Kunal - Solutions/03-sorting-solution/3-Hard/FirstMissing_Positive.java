package com.company;
//Question: https://leetcode.com/problems/first-missing-positive/

public class FirstMissing_Positive {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i< nums.length){
            int correct = nums[i]-1; //supposed correct index
            if(nums[i]>0 && nums[i]<= nums.length && nums[i]!=nums[correct])
            {
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        //search for 1st positive missing number
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!= index+1)
                return index+1;
        }
        //if the array does not contain any missing positive number
        return nums.length+1;

    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
