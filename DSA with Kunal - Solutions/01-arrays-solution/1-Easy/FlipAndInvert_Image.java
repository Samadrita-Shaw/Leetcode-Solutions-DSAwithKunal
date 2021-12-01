package com.company;

import java.util.Arrays;

public class FlipAndInvert_Image {
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0; i<image.length; i++)
        {
            int start=0,end=image[i].length-1;
            while(start<end)
            {
                swap(image[i], start, end);
                start++;
                end--;
            }
            for(int j=0; j<image[i].length; j++)
            {
                if(image[i][j]==0)
                    image[i][j]=1;
                else
                    image[i][j]=0;
            }
        }
        return image;
    }
    public static void swap(int[] arr, int index1, int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    public static void main(String[] args) {
        int[][] image= {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(flipAndInvertImage(image)));
        }
    }
}

