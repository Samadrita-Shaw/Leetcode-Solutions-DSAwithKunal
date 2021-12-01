/*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.
Example 1:
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4]. */

package com.company;

import java.util.*;
public class Running_SumArray {
    public static int[] runningSum(int[] nums) {
        int[] rsum= new int[nums.length];
        int sum=nums[0];
        rsum[0]=nums[0];
        for(int i=1; i<nums.length; i++)
        {
            rsum[i]=sum+nums[i];
            sum=rsum[i];
        }
        return rsum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums=new int[4];
        System.out.println("Enter array elements");
        for (int i = 0; i < 4; i++) {
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
