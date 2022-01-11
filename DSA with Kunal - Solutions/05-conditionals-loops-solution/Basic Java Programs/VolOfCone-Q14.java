package com.Akash;

import java.util.Scanner;

public class VolOfCone14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();
        double vol =  Math.PI * radius * radius * height / 3;
        System.out.println(vol);


    }
}
