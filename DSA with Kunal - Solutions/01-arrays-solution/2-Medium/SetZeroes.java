/* Given an m x n integer matrix,
 if an element is 0, set its entire row and column to 0's, and return the matrix.
 */
package com.company;
import java.util.*;
public class SetZeroes
{
    public static void setZeroes(int[][] matrix)
    {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        for(int i=0; i< matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int k = 0; k < row.size(); k++)
        {
            for (int i = 0; i < matrix[0].length; i++)
            {
                matrix[row.get(k)][i]=0;
            }
        }
        for (int k = 0; k < col.size(); k++)
        {
            for (int i = 0; i < matrix.length; i++)
            {
                matrix[i][col.get(k)]=0;
            }
        }
        for(int i=0; i< matrix.length; i++)
        {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {
        int[][] matrix= {
                {0,1,2,0},
                {3,4,0,2},
                {1,3,1,5}
             };
        setZeroes(matrix);
    }
}
