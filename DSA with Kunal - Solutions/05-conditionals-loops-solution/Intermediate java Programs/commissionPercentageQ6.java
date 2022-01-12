package com.Akash;

import java.util.Scanner;

public class commissionPercentageQ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amount = in.nextDouble();
        System.out.println("Enter the commission Percentage: ");
        double CommissionPercentage = in.nextDouble();
        double commission = CommissionPercentage * amount / 100 ;
        System.out.println("commission amount: " + commission);

    }
}
