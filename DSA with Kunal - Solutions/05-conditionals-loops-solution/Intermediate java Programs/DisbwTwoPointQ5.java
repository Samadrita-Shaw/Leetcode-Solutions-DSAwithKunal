package com.Akash;

import java.util.Scanner;

public class DisbwTwoPointQ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x1, x2, y1, y2;
        x1 = in.nextFloat();
        y1 = in.nextFloat();
        x2 = in.nextFloat();
        y2 = in.nextFloat();

        double dist = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+") is: "+dist);
    }
}
