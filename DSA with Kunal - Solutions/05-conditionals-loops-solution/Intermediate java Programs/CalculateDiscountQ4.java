package com.Akash;

import java.util.Scanner;

public class CalculateDiscountQ4 {
    public static void main(String[] args) {
        double  dis, amountpay,s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of shopping: ");
        double amount = in.nextDouble();
        if(amount<=1000){
            dis = amount * 0.05; // 5% discount
            amountpay = amount - dis;
        }
        else if(amount<=5000){
            dis = amount * 0.1; //10% discount
            amountpay = amount - dis;
        }
        else{
            dis = amount * 0.2; //20% discount
            amountpay = amount - dis;
        }
        System.out.println("payable amount is: " + amountpay);
    }
}
