package com.company;
import java.util.*;
public class MaximumPopulation {
    public static int maximumPopulation(int[][] logs) {
        int[] year = new int[2051];
        for(int[] log : logs){

            year[log[0]] += 1;
            year[log[1]] -= 1;
        }

        int maxNum = year[1950], maxYear = 1950;

        for(int i = 1951; i < year.length; i++)
        {
            year[i] += year[i - 1];

            if(year[i] > maxNum)
            {
                maxNum = year[i];
                maxYear = i;
            }
        }
        return maxYear;
    }

    public static void main(String[] args) {
        int[][] logs={
                {1993,1999},
                {1993,2010},
                {2000,2010},
                {2000,2009}
        };
        System.out.println(maximumPopulation(logs));
    }
}
