package com.Akash;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double side = in.nextDouble();
        double area = 0.43301270189 * side * side ;
        System.out.println(area);

    }
}
