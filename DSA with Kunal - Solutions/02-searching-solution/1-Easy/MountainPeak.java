package com.company;
// Question: https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
public class MountainPeak
{
    public static void main(String[] args) {
        int[] arr={2,4,6,5,4,1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr)
    {
        int start= 0;
        int end= arr.length-1;
        while(start<end)
        {
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1])    //You are in the decreasing part of the array
            {
                end=mid; //this may be the possible answer
            }
            else     //You are in the increasing part of the array
            {
                start= mid+1;  //because we know that the mid+1 element is greater than mid-element
            }
        }
        //In the end, start==end, will point to the peak value
        return start;  // return end; because start==end
    }
}
