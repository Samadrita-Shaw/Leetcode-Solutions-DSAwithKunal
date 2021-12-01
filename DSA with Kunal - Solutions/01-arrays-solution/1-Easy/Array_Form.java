package com.company;
import java.util.*;
public class Array_Form {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>(3);
        int s=0,carry=0;

        for(int i=num.length-1; i>=0; i--)
        {
            s=num[i]+k%10;
            list.add(0,s%10);
            carry=s/10;
            k=(k/10)+carry;
        }
        if(k!=0)
        {
            while(k>0)
            {
                list.add(0,k%10);
                k=k/10;
            }
        }

        return list;
    }
    public static void main(String[] args) {
        int[] num={1,2,0,0};
        System.out.println(addToArrayForm(num,183));
    }
}
