package com.company;
import java.util.*;
public class RotateArrayRight
{
    public static void rotate(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++)
        {
            list.add(nums[i]);
        }
        while(k>0)
        {
            list.add(0, list.get(list.size()-1));
            list.remove(list.size()-1);
            k--;
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);

        /*int[] nums2={-1,-100,3,99};
        int k2=2;
        rotate(nums2, k2);

        int[]nums3 ={1};
        int k3=2;
        rotate(nums3, k3); */

    }
}
