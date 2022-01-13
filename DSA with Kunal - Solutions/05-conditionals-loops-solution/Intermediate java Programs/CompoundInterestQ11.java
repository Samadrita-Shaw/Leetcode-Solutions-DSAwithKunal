package com.Akash;

import java.util.Scanner;

public class CompoundInterestQ11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of principle: ");
        double principle = in.nextDouble();
        System.out.println("Enter the value of rate: ");
        double rate = in.nextDouble();
        System.out.println("Enter the value of time: ");
        double time = in.nextDouble();

        /* Calculate compound interest */
        double CI = principle *
                (Math.pow((1 + rate / 100), time));

        System.out.println("Compound Interest is "+ CI);


    }
}


