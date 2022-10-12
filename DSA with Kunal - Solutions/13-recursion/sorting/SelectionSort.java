package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {20, 1, 5, 0, 14};
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr, int i, int j, int maxIndex){
        if(i==0)
            return;

        if(j<i){
            if(arr[j]>arr[maxIndex])
                maxIndex = j;

            selection(arr, i, j+1, maxIndex);
        }
        else{   //end of one traversal through the row
            //swap the max
            int temp = arr[i-1];
            arr[i-1] = arr[maxIndex];
            arr[maxIndex] = temp;
            selection(arr, i-1, 0, 0);
        }
    }
}
