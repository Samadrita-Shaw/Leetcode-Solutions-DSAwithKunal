package com.Akash;

import java.util.Scanner;

public class CalculateDepreciationOfValueQ8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of V1: ");
        float V1 = in.nextFloat();  // V1 is the value at initial time
        System.out.println("Enter the value of R");
        float R = in.nextFloat();   //R% per annum is the rate
        System.out.println("Enter the time duration: ");
        float T = in.nextFloat();   // T is time
        System.out.print("The value of V2: "+Depreciation(V1, R, T)); //the value V2 at the end of T years
    }
    static float Depreciation(float v, float r, float t)
        {
            float D = (float)(v * Math.pow((1 - r / 100), t));

            return D;
        }

}
