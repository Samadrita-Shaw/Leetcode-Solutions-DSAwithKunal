package com.Akash.assignment;
 // Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int temp;
        int max = 0;
        do{
            n  =  in.nextInt();
            temp = n ;
            if(temp > max) {
                max = temp;
            }
        }
        while(n != 0);
            System.out.println(max);
    }
}
