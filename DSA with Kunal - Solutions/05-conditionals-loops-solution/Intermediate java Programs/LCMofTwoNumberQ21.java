package com.Akash;

import java.util.Scanner;

public class LCMofTwoNumberQ21 {
    public static void main(String[] args) {
        int hcf = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = in.nextInt();
        System.out.println("Enter second number : ");
        int b = in.nextInt();

        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0)
                hcf = i;
        }
        int lcm = a*b/hcf;
        System.out.println("HCF of given two numbers is :" + lcm);
    }
}