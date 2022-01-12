package com.Akash.assignment;

import java.util.Scanner;

public class VolOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        double height = in.nextDouble();
        double prismLength = in.nextDouble();
        double volume = 0.5 * base * height * prismLength;
        System.out.println(volume);


    }

}
