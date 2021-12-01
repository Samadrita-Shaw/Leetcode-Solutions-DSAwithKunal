/* Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].
Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
*/
package com.company;

import java.util.*;
public class ShuffleArray {
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2*n];
        int k=0;
        for(int i=0; i<arr.length; i++)
        {
            if(i%2==0)
                arr[i]=nums[k];
            else{
                arr[i]=nums[n+k];
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter n");
        int n=in.nextInt();
        int[] nums= new int[2*n];
        System.out.println("Enter elements");
        for (int i = 0; i < nums.length; i++) {
            nums[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(nums,n)));
    }
}
