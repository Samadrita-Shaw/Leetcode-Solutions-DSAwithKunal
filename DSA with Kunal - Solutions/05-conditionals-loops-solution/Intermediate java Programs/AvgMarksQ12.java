package com.Akash;

import java.util.Scanner;

public class AvgMarksQ12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int n = in.nextInt();
        double[] sub = new double[n];
        double Avg = 0;
        double sum = 0;
        for(int i=0;i<n;i++){
            System.out.println("Enter marks of subject: ");
            sub[i] = in.nextDouble();
        }
        for(int i=0;i<n;i++)
        {
             sum += sub[i];
        }
        Avg = sum / n ;
        System.out.println("Average of marks is: "+Avg);

    }
}
