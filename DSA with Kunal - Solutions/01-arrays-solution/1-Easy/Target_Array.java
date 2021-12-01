/* Given two arrays of integers nums and index. Your task is to create target array under the following rules:
Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.
It is guaranteed that the insertion operations will be valid.

Example 1:
Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
 */

package com.company;
import java.util.*;
public class Target_Array {
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            arr.add(index[i],nums[i]);
        }
        int[] target = new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            target[i]= arr.get(i);
        }
        return target;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        int[] index = new int[5];
        System.out.println("Enter number array");
        for(int i=0; i<5; i++)
        {
            nums[i]=in.nextInt();
        }
        System.out.println("Enter index array");
        for(int i=0; i<5; i++)
        {
            index[i]=in.nextInt();
        }
        System.out.println("Target Array: "+ Arrays.toString(createTargetArray(nums,index)));

    }
}
