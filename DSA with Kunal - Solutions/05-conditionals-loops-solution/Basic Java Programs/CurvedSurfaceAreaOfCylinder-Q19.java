package com.Akash.assignment;

import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();
        double area = Math.PI * 2 * radius * height;
        System.out.println(area);


    }
}
