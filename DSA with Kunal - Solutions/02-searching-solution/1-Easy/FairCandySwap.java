package com.company;

import java.util.Arrays;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSize ={1,5,2};
        int[] bobSizes ={4,2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSize,bobSizes)));
    }

    public static int sumCalc(int[] arr)
    {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int s1=sumCalc(aliceSizes), s2=sumCalc(bobSizes);
        Arrays.sort(bobSizes);

        for (int i = 0; i < aliceSizes.length; i++) {
            int start = 0, end = bobSizes.length-1;
            while(start<=end)
            {
                int mid = start + (end - start)/2;
                if(s1-aliceSizes[i]+bobSizes[mid]==s2-bobSizes[mid]+aliceSizes[i])
                    return new int[] {aliceSizes[i], bobSizes[mid]};
                else if(s1-aliceSizes[i]+bobSizes[mid]>s2-bobSizes[mid]+aliceSizes[i])
                    end=mid-1;
                else
                    start=mid+1;
            }
        }
        return new int[] {-1,-1};
    }
}
