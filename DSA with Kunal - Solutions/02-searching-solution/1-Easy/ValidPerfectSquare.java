package com.company;

import java.util.*;
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int start=1, end=num/2, root=1;
        while(start<=end)
        {
            double mid=start+(end-start)/2;
            if(mid==num/mid)        //if the middle element is a perfect square
                return true;

            else if(mid<num/mid)
            {
                start=(int)mid+1;
                root=(int)mid;
            }

            else
                end=(int)mid-1;
        }
        if(root*root==num)          //Important, when checking for values like 1, where end<start
            return true;

        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=in.nextInt();
        System.out.println(isPerfectSquare(num));
    }
}
