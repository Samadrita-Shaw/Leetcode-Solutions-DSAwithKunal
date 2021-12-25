package com.company;

import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 4};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cycle(int[] arr)
    {
        int i=0;
        while(i< arr.length){
            int correct = arr[i]-1; //supposed correct index
            if(arr[i]!=arr[correct])
            {
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
