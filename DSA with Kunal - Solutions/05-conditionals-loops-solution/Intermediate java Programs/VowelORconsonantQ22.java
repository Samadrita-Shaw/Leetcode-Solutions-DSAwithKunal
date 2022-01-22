package com.Akash;

import java.util.Scanner;

public class VowelORconsonantQ22 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a alphabet: ");
        char ch = in.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
    }
}
