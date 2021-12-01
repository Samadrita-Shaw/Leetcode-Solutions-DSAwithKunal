package com.company;

public class BinarySearch
{
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target= 5;
        System.out.println(binarySearch(arr, target));
    }
    public static int binarySearch(int[] arr, int target)
    {
        int start=0,end=arr.length-1;
        while(start<=end)
        {
            int mid = start+((end-start)/2);
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                start = mid+1;
            else
                end = mid-1;
        }
            return -1;
    }
}
