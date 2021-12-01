/* You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
Return true if you can reach the last index, or false otherwise.
Example 1:
Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
package com.company;

public class JumpGame
{
    public static boolean canJump(int[] nums)
    {
        int reachable=0;
        for(int i=0; i<nums.length; i++)
        {
            if(reachable<i)
                return false;

            reachable= Math.max(reachable, i+nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums={2,3,1,1,0};
        System.out.println(canJump(nums));
    }
}
