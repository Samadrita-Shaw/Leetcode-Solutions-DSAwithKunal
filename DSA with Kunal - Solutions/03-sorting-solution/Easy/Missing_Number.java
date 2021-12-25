package com.company;
//Question: https://leetcode.com/problems/missing-number/

public class Missing_Number {
    public static void main(String[] args) {
        int[] arr = {5, 0, 1, 2, 4};
        System.out.println(missing(arr));
    }
    public static int missing(int[] arr)
    {
        int i=0;
        while(i< arr.length){
            int correct = arr[i]; //supposed correct index
            if(arr[i]< arr.length && arr[i]!=arr[correct])
            {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
        //search for 1st missing number
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!=index)
                return index;
        }
        //if the array does not contain any missing number
        return arr.length;
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}