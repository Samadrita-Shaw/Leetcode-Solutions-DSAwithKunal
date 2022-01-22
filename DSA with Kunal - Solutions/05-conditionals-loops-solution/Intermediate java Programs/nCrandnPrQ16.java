package com.Akash;

import java.util.Scanner;

public class nCrandnPrQ16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        System.out.println("Enter the value of r: ");
        int r = in.nextInt();
        System.out.println("value of nCr is: "+ nCr(n, r));
        System.out.println("value of nPr is: "+ nPr(n, r));
        }
    static double nPr(int n, int r)
    {
        return (double) fact(n) / fact(n - r);
    }
    static double nCr(int n, int r)
    {
        return (double) fact(n) / (fact(r) *
                fact(n - r));
    }
    static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

    }

