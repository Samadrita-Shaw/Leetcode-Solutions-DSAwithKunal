package com.Akash;

import java.util.Scanner;

public class PeriOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double length = in.nextDouble();
        double width = in.nextDouble();
        double peri = 2*(length+width);
        System.out.println(peri);
    }
}
