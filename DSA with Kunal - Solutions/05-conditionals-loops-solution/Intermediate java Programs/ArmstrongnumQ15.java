package com.Akash;

import java.util.Scanner;

public class ArmstrongnumQ15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();  // n is Armstrong or not
        System.out.println(isArmstrong(n));
        System.out.println("Enter value of m: ");
        int m = in.nextInt();
        // Armstrong number till m
        for (int i = 0; i < m; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += rem*rem*rem;
        }
        return sum == original;
    }
}
