package com.Akash;

import java.util.Scanner;

public class SumOfNumberQ14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number the value of n");
        int n = in.nextInt();
        int num = 0;
        int count = 1;
        float sum =0;
        while(count<=n){
            System.out.println("Enter the "+count+" number: ");
            num = in.nextInt();
            sum +=num;
            count++;
        }
        System.out.println("Sum is: "+sum);
    }
}
