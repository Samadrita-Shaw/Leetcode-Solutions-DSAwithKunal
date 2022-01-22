package com.Akash;

import java.util.Scanner;

public class CalculateElectricityBillQ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int unit = in.nextInt();
        double pay = 0;
        if(unit<=50){
            pay = unit*4.75 + 230; //230 is fixed cost per month
        }
        else if(unit<=150){
            pay = unit*6.5 + 230;  //230 is fixed cost per month
        }
        else if(unit<=300){
            pay = unit*7.35 + 275;  //275 is fixed cost per month
        }
        else if(unit<=500){
            pay = unit*7.65 + 345;  //345 is fixed cost per month
        }
        else {
            pay = unit*7.95 + 400;   //400 is fixed cost per month
        }
        System.out.println(pay);

    }
}
