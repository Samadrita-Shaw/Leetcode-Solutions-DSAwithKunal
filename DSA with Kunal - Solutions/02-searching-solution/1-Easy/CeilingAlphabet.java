/* https://leetcode.com/problems/find-smallest-letter-greater-than-target/ */
package com.company;
import java.util.*;
public class CeilingAlphabet
{
    public static void main(String[] args)
    {
        char[] w= {'a','b','c'};
        char target = 'b';
        System.out.println("Ceiling alphabet : "+ ceiling(w, target));

    }
    public static char ceiling(char[] letters, char target)
    {
        int start= 0;
        int end= letters.length-1;
        while(start<=end)
        {
            int mid= start +(end - start)/2;
            if(letters[mid]>target)
                end = mid -1;
            else
                start = mid +1;
        }
        return letters[start% letters.length];
    }
}