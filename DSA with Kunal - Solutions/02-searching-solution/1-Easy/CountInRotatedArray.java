package com.company;
//Question: https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class CountInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    public static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    // use this for non duplicates
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {  //case 1
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {    //case 2
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {   //case 3
                end = mid - 1;
            } else {
                start = mid + 1;   //case 4
            }
        }
        return -1;
    }
}
