package com.company;
//Question: https://leetcode.com/problems/intersection-of-two-arrays-ii/

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionArrayRepeat {
    public static int search(int[] nums, int target, boolean findStartIndex)    //to find the start and end index of the element
    {
        int start = 0;
        int end = nums.length-1;
        int ans= -1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(nums[mid]>target)
                end= mid-1;
            else if(nums[mid]<target)
                start= mid+1;
            else
            {
                ans = mid;       //possible answer found
                if(findStartIndex)
                {
                    end= mid-1;
                }
                else
                    start= mid+1;
            }
        }
        return ans;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1); //sorting for applying binary search
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>(10);  //for storing the result in a list, since size unknown

        if (nums1.length <= nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
                if(i==0 || nums1[i]!=nums1[i-1])
                {
                    if(search(nums2,nums1[i], true)>=0 && search(nums1,nums1[i],true)>=0) { //to ignore the missing element
                        int c2 = search(nums2, nums1[i], false) - search(nums2, nums1[i], true);
                        int c1 = search(nums1, nums1[i], false) - search(nums1, nums1[i], true);
                        for (int j = 0; j < Math.min(c1 + 1, c2 + 1); j++) {
                            list.add(nums1[i]);
                        }
                    }
                }
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                if(i==0 || nums2[i]!=nums2[i-1]){
                    if(search(nums2,nums2[i], true)>=0 && search(nums1,nums2[i],true)>=0)
                    {
                        int c2= search(nums2,nums2[i],false)-search(nums2,nums2[i], true) +1;
                        int c1= search(nums1,nums2[i],false)-search(nums1,nums2[i],true) +1;
                        for (int j = 0; j < Math.min(c1,c2); j++) {
                            list.add(nums2[i]);
                        }
                    }
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

        int[] nums1 = {1,2,2,2,1};
        int[] nums2 = {2,2,3};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
