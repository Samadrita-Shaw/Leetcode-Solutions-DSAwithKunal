/* Order Agnostic Binary Search: When you know that array is sorted, but don't know whether in ascending or descending order */
package com.company;

public class OrderAgnosticBinarySearch
{
    public static void main(String[] args) {
        int[] arr={18,12,10,9,5,1};
        int target= 5;
        System.out.println(orderAgnosticBS(arr, target));  //index of the searched value
    }
    public static int orderAgnosticBS(int[] arr, int target)
    {
        int start=0,end=arr.length-1;
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