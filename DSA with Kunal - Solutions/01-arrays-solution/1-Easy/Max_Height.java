package com.company;
import java.util.*;
public class Max_Height {
    public static int largestAltitude(int[] gain) {
        int[] altitude=new int[gain.length+1];
        altitude[0]=0;
        int max=0;
        for(int i=1; i<altitude.length; i++)
        {
            altitude[i]=altitude[i-1]+gain[i-1];
            max= Math.max(max,altitude[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] gain = new int[5];
        System.out.println("Enter altitude points");
        for(int i=0; i<5; i++)
        {
            gain[i]=in.nextInt();
        }
        System.out.println("Maximum height point: "+largestAltitude(gain));
    }
}
