package com.Akash;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double area =  Math.PI * radius * radius;
        System.out.println(area);

    }
}
