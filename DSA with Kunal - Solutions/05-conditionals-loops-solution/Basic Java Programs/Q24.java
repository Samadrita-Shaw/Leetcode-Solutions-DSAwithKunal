package com.Akash.assignment;

import java.util.Scanner;

// Take integer inputs till the user enters 0 and print the sum of all numbers
public class Q24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n;
        System.out.println("numbers: ");
        do{
             n = in.nextInt();
            sum += n;
        }
        while (n != 0);
        System.out.println("Sum = " + sum);

    }
}
