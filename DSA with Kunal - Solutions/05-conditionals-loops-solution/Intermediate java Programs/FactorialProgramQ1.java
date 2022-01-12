package com.Akash;

import java.util.Scanner;

public class FactorialProgramQ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int temp=1;
        for(int i =1;i<=num;i++){
            temp = temp*i;
        }
        System.out.println("Factorial of "+num +" is: "+temp);
    }

}
