package com.Akash;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 	Length: ");
        double 	Length = in.nextDouble();
        System.out.println("Enter the Width: ");
        double Width = in.nextDouble();
        double area =  	Length * Width ;
        System.out.println(area);

    }
}
