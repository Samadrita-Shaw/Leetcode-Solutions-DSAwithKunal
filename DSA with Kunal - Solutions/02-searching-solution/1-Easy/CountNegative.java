package com.company;
//Question: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/

public class CountNegative {
    public static void main(String[] args) {
        int[][] grid = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, -1, -2},
                {-1, -1, -2, -3}
        };

        System.out.println("Number of negative values= "+countNegatives(grid));
    }
    public static int countNegatives(int[][] grid) {
        int row=0, col= grid[0].length-1, c=0;
        while(row< grid.length && col>=0)
        {
            if(grid[row][col]<0)        //if the element is negative
            {
                c+= grid.length-row;    //increase the counter of negative numbers
                col--;      //since the element is negative, it means the whole column will contain negative number (decreasing matrix)
            }
            else if(grid[row][col]>=0)
                row++;      //If the element is positive, it's useless to search on the left side of the element.
        }
        return c;
    }
}
