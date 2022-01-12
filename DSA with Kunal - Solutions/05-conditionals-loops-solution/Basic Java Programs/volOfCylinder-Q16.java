package com.Akash.assignment;

import java.util.Scanner;

public class volOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();

        double vol = Math.PI*radius*radius*height;
        System.out.println(vol);
    }
}
