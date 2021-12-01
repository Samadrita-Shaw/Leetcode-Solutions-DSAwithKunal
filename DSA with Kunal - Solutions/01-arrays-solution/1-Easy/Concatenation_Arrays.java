/*
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
 */

package com.company;

import java.util.*;
public class Concatenation_Arrays {

        public static int[] getConcatenation(int[] nums) {
            int[] ans = new int[2*nums.length];
            for(int i=0;i<ans.length; i++ )
            {
                if(i<nums.length)
                {
                    ans[i]=nums[i];
                }
                else
                    ans[i]=nums[i-nums.length];
            }
            return ans;
        }
         public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[] nums=new int[3];
            System.out.println("Enter elements");
            for (int i = 0; i < 3; i++) {
                nums[i]= in.nextInt();
            }
             System.out.print("Concatenated array: "+Arrays.toString(getConcatenation(nums)));
    }
}
