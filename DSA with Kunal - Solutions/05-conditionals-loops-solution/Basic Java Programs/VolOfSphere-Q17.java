package com.Akash.assignment;

import java.util.Scanner;

public class VolOfSphere {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double vol = Math.PI*radius*radius*radius*4/3 ;
        System.out.println(vol);
    }
}
