package com.company;
// Question: You are given a Mountain Array. Search for the given element in the array
public class FindInMountainArray
{
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,3,1};
        int target= 3;
        System.out.println(search(arr, target));
    }
    static int search(int[] arr, int target)
    {
        int peak= peakIndexInMountainArray(arr);
        int firstTry= orderAgnosticBS(arr, target,0, peak);   //search in first half
        if(firstTry!=-1)   //element is present is first part of the array
        {
            return firstTry;
        }
        return orderAgnosticBS(arr, target,peak+1, arr.length-1);   //search in second half
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
    public static int orderAgnosticBS(int[] arr, int target, int start, int end)
    {
        boolean isAsc = arr[start]<arr[end];    //is in Ascending or descending order
        while(start<=end)
        {
            int mid = start+((end-start)/2);
            if(arr[mid]==target)
                return mid;
            if(isAsc)
            {
                if(target<arr[mid])
                    end = mid-1;
                else
                    start = mid+1;
            }
            else {
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
