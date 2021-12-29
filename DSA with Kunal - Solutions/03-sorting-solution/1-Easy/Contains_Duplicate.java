package com.company;
//Question: https://leetcode.com/problems/contains-duplicate/

import java.util.Arrays;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(duplicate(arr));
    }

    public static boolean duplicate(int[] nums) {

        Arrays.sort(nums);
        for (int index = 0; index < nums.length - 1; index++) {
            if (nums[index] == nums[index + 1])
                return true;
        }
        return false;
    }
}