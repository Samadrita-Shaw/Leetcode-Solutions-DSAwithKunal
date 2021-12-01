package com.company;

public class LinearSearchStrings {
    public static void main(String[] args) {
        String s= "CommClassroom";
        char target='c';
        System.out.println(linearSearch(s,target));
    }
    public static boolean linearSearch(String s, char target)
    {
        if(s.length()==0)
        {
            return false;
        }
        else {
            s=s.toLowerCase();
            for (char ch : s.toCharArray()) {     //for-each works only for collections, thus converted string to char array
                if (ch == target)
                    return true;
            }
        }
            return false;
    }
}
