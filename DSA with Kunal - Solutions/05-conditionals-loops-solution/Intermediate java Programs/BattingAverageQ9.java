package com.Akash;

import java.util.Scanner;

public class BattingAverageQ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Run Scored: ");
        int RunsScored = in.nextInt();
        System.out.println("Enter how many times cricketer is out: ");
        int TimesOut = in.nextInt();
        double BattingAvg =  ((double) RunsScored/TimesOut);
        System.out.println(BattingAvg);
    }
}
