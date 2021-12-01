package com.company;
//Question: https://leetcode.com/problems/sqrtx/

import java.util.*;
public class SquareRoot
{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number");
        int x = in.nextInt();
        System.out.println(mySqrt(x));

    }
    public static int mySqrt(int x) {
        if (x == 0 || x == 1)   //if the number entered is 0 or 1, square root will be the number itself.
            return x;

        int start = 1, end = x/2, sqrt = 0;  //end=x/2, since square root of whole numbers are always less than the half of the number
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == x / mid)     //if the mid-element is the square root of the number
                return mid;

            else if (mid < x/mid)   //if the square of the middle element less than the number, then
            {
                sqrt = mid;         //either the middle element is the possible answer, or
                start = mid + 1;    //the answer lies in the second half
            } else
                end = mid - 1;      //if the square of the number is greater than the element, the square root will lie in the first half.
        }
        return sqrt;
    }
}
