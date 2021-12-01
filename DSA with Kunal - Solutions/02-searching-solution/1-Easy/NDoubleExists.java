package com.company;
//Question: https://leetcode.com/problems/check-if-n-and-its-double-exist/
import java.util.Arrays;

public class NDoubleExists {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 3};
        System.out.println(checkIfExist(arr));

    }
    public static boolean checkIfExist(int[] arr) {

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int j = binarySearch(arr, 2*arr[i]);
            if(j!=-1 && i != j && arr[j] == 2 * arr[i]) //j==-1 => element does not exists
                return true;
        }
        return false;
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
