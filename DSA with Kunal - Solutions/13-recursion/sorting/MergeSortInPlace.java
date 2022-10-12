package sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5, 9, 4, 2, 0, 10, 3};
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSortInPlace(int[] arr, int s, int e){
        if(e - s ==1)
            return;

        int mid = (s+e)/2;
        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        merge(arr, s, mid, e);
    }
    public static void merge(int[] arr, int s, int mid, int e){
        int i = s, j = mid, k = 0;

        int[] mix = new int[e-s];

        while (i< mid && j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i<mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
