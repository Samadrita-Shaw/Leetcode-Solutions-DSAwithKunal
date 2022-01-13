package com.Akash;

import java.util.Scanner;

public class PowerQ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base: ");
        double num = in.nextDouble();
        System.out.println("Enter the power: ");
        double pow = in.nextDouble();
        System.out.println("Your Answer is: " +Math.pow(num, pow));

    }
}
