package com.company;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr={1,89,98,0,8,3};
        int target = 98;
        System.out.println(linearSearch(arr, target));

    }
    public static int linearSearch(int[] arr, int target)
    {
        if(arr.length==0)
            return -1;
        else{
            for(int i=0; i<arr.length; i++)
            {
                if(arr[i]==target)
                    return i;
            }
        }
        return -1;
    }
}
