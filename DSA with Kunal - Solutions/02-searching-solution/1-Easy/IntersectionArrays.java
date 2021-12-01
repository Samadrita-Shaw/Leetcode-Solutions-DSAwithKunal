package com.company;
//Question: https://leetcode.com/problems/intersection-of-two-arrays/solution/

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionArrays {
    public static boolean binarySearch(int[] arr, int target){
        int start=0, end=arr.length-1;
        while(start<=end)
        {
            int mid = start+((end-start)/2);
            if(arr[mid]==target)
                return true;
            else if(arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }
        return false;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1); //sorting for applying binary search
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>(10);  //for storing the result in a list, since size unknown

        if(nums1.length <= nums2.length)
        {
            for (int i = 0; i < nums1.length; i++) {
                if((i==0 || nums1[i]!=nums1[i-1]) && binarySearch(nums2,nums1[i]))
                {
                    list.add(nums1[i]);
                }

            }
        }
        else{
            for (int i = 0; i < nums2.length; i++) {
                if((i==0 || nums2[i]!=nums2[i-1]) && binarySearch(nums1,nums2[i]))
                {
                    list.add(nums2[i]);
                }
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;     //return type is int

    }
    public static void main(String[] args) {

        int[] nums1 = {9,3,7};
        int[] nums2 = {6,4,1,0,0,4,4,8,7};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
