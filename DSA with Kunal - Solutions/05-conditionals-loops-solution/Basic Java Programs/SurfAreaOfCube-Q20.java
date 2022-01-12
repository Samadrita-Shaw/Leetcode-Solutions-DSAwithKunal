package com.Akash.assignment;

import java.util.Scanner;

public class SurfAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double side = in.nextDouble();
        double area = 6 * side * side;
        System.out.println(area);
    }
}
