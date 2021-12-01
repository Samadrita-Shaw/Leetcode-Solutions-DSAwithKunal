/* Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.
Example 1:
Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
 */
package com.company;

import java.util.*;
public class SmallerThanCurrent {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];
        int c=0;
        for(int i=0; i<nums.length; i++)
        {
            c=0;
            for(int num:nums)
            {
                if(nums[i]>num)
                    c++;
            }
            arr[i]=c;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums= new int[5];
        System.out.println("Enter numbers");
        for (int i = 0; i < 5; i++){
            nums[i] = in.nextInt();
        }
        System.out.println("Entered array: "+Arrays.toString(nums));
        System.out.print("number of elements less than each element:"+Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
}
