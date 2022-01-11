package com.Akash.assignment;

import java.util.Scanner;

public class VolOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double Baselength = in.nextDouble();
        double Basewidth = in.nextDouble();
        double Pyramidheight = in.nextDouble();

        double vol = Baselength*Basewidth*Pyramidheight / 3 ;
        System.out.println(vol);

    }
}
