/* A lucky number or Saddle Point is an element of the matrix such that
 it is the minimum element in its row and maximum in its column.
 */
package com.company;
import java.util.*;
public class SaddlePoint
{
    public static List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int min, min_r,min_c,max,max_r,max_c;
        for(int i=0; i<matrix.length; i++)
        {
            min=matrix[i][0];
            min_r=i;
            min_c=0;
            for(int j=0; j<matrix[i].length; j++)
            {
                if(matrix[i][j]<min)
                {
                    min=matrix[i][j];
                    min_r=i;
                    min_c=j;
                }
            }
            max=matrix[0][min_c];
            max_r=0;
            max_c=min_c;
            for(int j=0; j<matrix.length; j++)
            {
                if(matrix[j][min_c]>max)
                {
                    max=matrix[j][min_c];
                    max_r=j;
                    max_c= min_c;
                }
            }
            if(min==max && min_r==max_r)
            {
                list.add(max);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] matrix={
                {1,10,4,2},
                {9,3,8,7},
                {15,16,17,12}
        };
        System.out.println(luckyNumbers(matrix));
    }
}
