//Question: https://leetcode.com/problems/roman-to-integer/
//NOTE: This is done without HashMap, coz I haven't studied it yet.


public class Roman_Strings {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));

    }
    public static int romanToInt(String s) {
        String ch = "IVXLCDM";  //stores the possible distinct roman numerals
        int[] value = {1, 5, 10, 50, 100, 500, 1000};   //stores their value in order
        int ans=0;
        for (int i = 0; i < s.length(); i++) {
            int i1 = ch.indexOf(s.charAt(i));   //stores the index of the ith character in the char[] ch
            if(i!=s.length()-1) //no need to check for the i+1 th character in case of the last element
            {
                int i2 = ch.indexOf(s.charAt(i+1));
                if(value[i1] >= value[i2])  //if the value1 is greater than value 2, do simple addition
                {
                    ans+=value[i1];
                }
                else    //else, it is a case of subtraction
                {
                    ans+=(value[i2] - value[i1]);
                    i++;
                }
            }
            else
                ans+=value[i1];
        }
        return ans;
    }
}