package com.Akash.assignment;

import java.util.Scanner;

//  Input a number and print all the factors of that number (use loops).
public class Q23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= n; i++){
            if (n % i == 0)
                System.out.println(i);
        }

    }
}
