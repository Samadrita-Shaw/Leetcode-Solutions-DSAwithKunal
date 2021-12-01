/* Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
 */
package com.company;
import java.util.*;
public class ProductExceptSelf
{
    public static int[] productExceptSelf(int[] nums) {
        int p=1;
        int[] ans = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for(int i=0; i<left.length; i++)
        {
            left[i]=p*nums[i];
            p=left[i];
        }
        p=1;
        for(int i=right.length-1; i>=0; i--)
        {
            right[i]=p*nums[i];
            p=right[i];
        }
        for(int i=0; i<ans.length; i++)
        {
            if(i==0)
                ans[i]=right[1];
            else if(i==ans.length-1)
                ans[i]=left[i-1];
            else
                ans[i]=left[i-1]*right[i+1];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
