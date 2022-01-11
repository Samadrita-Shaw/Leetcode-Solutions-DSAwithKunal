package com.Akash;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double peri =  Math.PI * radius * 2;
        System.out.println(peri);
    }
}
