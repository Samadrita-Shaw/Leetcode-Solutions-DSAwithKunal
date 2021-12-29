package com.company;
//Question: https://leetcode.com/problems/minimum-absolute-difference/
//(NOTE: This approach took 20ms runtime and 59 MB space. I will update the solution once I get the optimized code)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Minimum_Absolute_Diff {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
            System.out.println(minimumAbsDifference(arr));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);   //sorting the array, can use any sorting technique like insertion sort as best case time complexity is O(n)
        List<List<Integer>> list = new ArrayList<>();
        //Calculates minimum difference
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < min)
                min = arr[i + 1] - arr[i];
        }
        //checks for condition
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == min) {
                list.add(answerList(i, i + 1, arr));
            }
        }
        return list;
    }

    //returns individual pair
    public static List<Integer> answerList(int a, int b, int[] arr) {
        List<Integer> ans = new ArrayList<>();
        ans.add(arr[a]);
        ans.add(arr[b]);

        return ans;
    }
}