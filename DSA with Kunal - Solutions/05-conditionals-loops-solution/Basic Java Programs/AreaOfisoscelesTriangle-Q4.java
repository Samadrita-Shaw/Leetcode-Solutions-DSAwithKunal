package com.Akash;

import java.util.Scanner;

public class AreaOfisoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base: ");
        double base = in.nextDouble();
        System.out.println("Enter the height: ");
        double height = in.nextDouble();
        double area = 0.5 * base * height ;
        System.out.println(area);
    }
}
