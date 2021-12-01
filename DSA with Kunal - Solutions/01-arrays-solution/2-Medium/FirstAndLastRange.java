/* Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
 */
package com.company;
import java.util.*;
public class FirstAndLastRange
{
    public static int[] searchRange(int[] nums, int target)
    {
        int[] out=new int[2];
        int c=0;
        for (int i = 0; i < nums.length; i++)
        {
            if((nums[i]==target && i==0) || (nums[i]==target && nums[i-1]!=target))
            {
                out[0]=i;
                c++;
            }
            if((nums[i]==target && i==nums.length-1) || (nums[i]==target && nums[i+1]!=target))
            {
                out[1]=i;
                c++;
                break;
            }
        }
        if(c==0)
        {
            out[0]=out[1]=-1;
        }
        else if(c==1)
            out[1]=out[0];

        return out;
    }

    public static void main(String[] args) {
        int target=8;
        int[] nums={5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, target)));

        int[] nums2={6,7,8,8,9};
        int target2=1;
        System.out.println(Arrays.toString(searchRange(nums2, target2)));

        int target3=5;
        int[] nums3={5,5};
        System.out.println(Arrays.toString(searchRange(nums3, target3)));

        int target4=4;
        int[] nums4={1,4};
        System.out.println(Arrays.toString(searchRange(nums4, target4)));
    }
}
