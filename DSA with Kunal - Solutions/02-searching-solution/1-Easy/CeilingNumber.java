//Ceiling number: Smallest number in the array, greater than equal to the target element

package com.company;

public class CeilingNumber
{
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target= 15;
        System.out.println(ceiling(arr, target));  //printing the index of the ceiling number
    }
    public static int ceiling(int[] arr, int target)
    {
        int start=0,end=arr.length-1;
        if(target>arr[end])
            return -1;
        else
        {
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
            return start;
        }
    }
}
