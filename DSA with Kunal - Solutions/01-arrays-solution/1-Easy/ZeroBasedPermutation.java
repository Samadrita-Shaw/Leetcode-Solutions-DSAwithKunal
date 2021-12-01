/*Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

        A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

        Example 1:

        Input: nums = [0,2,1,5,3,4]
        Output: [0,1,2,4,5,3]
        Explanation: The array ans is built as follows:
        ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
        = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
        = [0,1,2,4,5,3] */


package com.company;
import java.util.*;
public class ZeroBasedPermutation {

    public static int[] permutation(int[] arr) {
        int[] permutation = new int[arr.length];
        for(int i=0; i<permutation.length; i++)
        {
            permutation[i] = arr[arr[i]];
        }
        return permutation;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Enter array");
        for (int i = 0; i < 6; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(permutation(arr)));
    }
}
