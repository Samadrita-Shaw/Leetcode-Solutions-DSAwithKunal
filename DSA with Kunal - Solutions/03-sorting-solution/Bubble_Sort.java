package com.company;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 5, 0};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr)
    {
        boolean swapped;
        //run the steps till n-1
        for(int i=0 ; i< arr.length; i++)
        {
            swapped=false;
            //for each step, the largest element will come at the end
            for(int j=1; j<arr.length-i; j++)
            {
                //swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
}
