package com.company;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfiniteArrayBS
{
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(answer(arr, target));

    }
    public static int answer(int[] arr, int target)
    {
        //Find the range first and assume the size of the range box to be 2
        int start=0;
        int end=1;

        while(target>arr[end])   //Condition for the target to lie in a range
        {
            int tempStart = end+1; //temporarily stored new start index
            end = end + (end-start+1)*2;  //doubling the range, formula => end= previous end+(size of the box*2)
            start = tempStart; //updating start
        }
        return binarySearch(arr, target, start, end);
    }
    public static int binarySearch(int[] arr, int target, int start, int end)
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
        return -1;
    }
}
