package com.company;
import java.util.*;
public class Cells_WithOddValue {
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix=new int[m][n];
        int ctr=0;
        for(int ind=0; ind<indices.length; ind++)
        {
            for(int col=0; col<n; col++)
            {
                matrix[indices[ind][0]][col]++;
            }
            for(int row=0; row<m; row++)
            {
                matrix[row][indices[ind][1]]++;
            }
        }
        for(int i=0; i<m; i++)
        {
            for(int val:matrix[i])
            {
                if(val%2!=0)
                    ctr++;
            }
        }
        return ctr;
    }

    public static void main(String[] args) {
        int[][] mat=new int[2][3];
        int[][] indices= {{0,1},{1,1}};
        System.out.println(oddCells(2,3 , indices));
    }
}
