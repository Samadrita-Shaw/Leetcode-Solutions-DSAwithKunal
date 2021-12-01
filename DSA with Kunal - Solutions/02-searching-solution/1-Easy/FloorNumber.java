package com.company;

public class FloorNumber
{
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target= 15;
        System.out.println(floor(arr, target));  //printing the index of the floor number
    }
    public static int floor(int[] arr, int target)
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
            return end;
        }
    }
}
