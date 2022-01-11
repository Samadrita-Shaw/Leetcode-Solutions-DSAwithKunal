package com.Akash;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Diagonal1: ");
        double Diagonal1 = in.nextDouble();
        System.out.println("Enter the Diagonal2: ");
        double Diagonal2 = in.nextDouble();
        double area =  0.5 * Diagonal1 * Diagonal2 ;
        System.out.println(area);


    }
}
