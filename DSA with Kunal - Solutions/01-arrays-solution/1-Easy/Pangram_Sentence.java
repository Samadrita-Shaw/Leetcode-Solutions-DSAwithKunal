/* A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
 */

package com.company;
import java.util.*;
public class Pangram_Sentence {
    public static boolean checkIfPangram(String sentence) {
        int ctr = 0;
        for(char alpha='a'; alpha<='z'; alpha++)
        {
            ctr=0;
            for(int i=0; i<sentence.length(); i++)
            {
                if(sentence.charAt(i)==alpha)
                    ctr++;
            }
            if(ctr==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence without any space");
        String s=in.next();
        System.out.println("Is it pangram sentence-" + checkIfPangram(s));
    }
}
