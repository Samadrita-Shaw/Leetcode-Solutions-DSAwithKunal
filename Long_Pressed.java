//Question: https://leetcode.com/problems/long-pressed-name/

public class Long_Pressed {
    public static void main(String[] args) {
        String name = "ab";
        String typed = "aaabbc";
        System.out.println(isLongPressedName(name, typed));
    }
    public static boolean isLongPressedName(String name, String typed) {
        int i=0, j=0;
        if(name.length()>typed.length())    //if typed is smaller that means definitely the name can't be formed.
            return false;

        while (i<name.length() && j<typed.length())
        {
            if(name.charAt(i)==typed.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                if(i>0 && name.charAt(i-1)==typed.charAt(j))
                    j++;
                else
                    return false;
            }

        }
        while(j<typed.length()) //if typed length is greater than name length
        {
            if(name.charAt(i-1)!=typed.charAt(j))
                return false;
            else
                j++;
        }
        if(i<name.length()) //if letters of name are still left even when typed is complete, then it is false
            return false;

        return true;

    }
}