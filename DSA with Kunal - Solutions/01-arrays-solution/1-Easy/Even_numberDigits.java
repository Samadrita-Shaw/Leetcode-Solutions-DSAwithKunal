/* Given an array nums of integers, return how many of them contain an even number of digits.
Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2
 */
package com.company;
import java.util.*;
public class Even_numberDigits {
    public static int findNumbers(int[] nums) {
        int n,c=0,ctr=0;
        for(int i=0;i<nums.length; i++)
        {
            c=0;
            n=nums[i];
            while(n>0)
            {
                c++;
                n=n/10;
            }
            if(c%2==0)
                ctr++;
        }
        return ctr;
    }

    public static void main(String[] args) {
        int[] nums={236,01,987,236598,22};
        System.out.println("Numbers with even number of digits= "+ findNumbers(nums));
    }

}
