package com.company;

import java.util.*;
public class Rotation90
{
    public static boolean findRotation(int[][] mat, int[][] target)
    {
        for(int i=0; i<4; i++)
        {
            rotate(mat);
            if (Arrays.deepEquals(mat, target))
                return true;
        }
        return false;
    }

    public static void rotate(int[][] matrix)
    {
        int start=0,end=matrix.length-1;
        while(start<end)
        {
            int[] temp= matrix[start];
            matrix[start]= matrix[end];
            matrix[end]= temp;
            start ++;
            end--;

        }
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = i + 1; j < matrix[0].length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix={
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };
        int[][] target = {
                {1,1,1},
                {0,1,0},
                {0,0,0}
            };
        System.out.println(findRotation(matrix,target));
    }

}