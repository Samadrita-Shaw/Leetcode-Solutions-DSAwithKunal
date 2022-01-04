//Question: https://leetcode.com/problems/implement-strstr/

public class StrStr_Implementation {
    public static void main(String[] args) {
        String haystack = "abc";
        String needle = "c";
        System.out.println(strStr(haystack, needle));

    }
    public static int strStr(String haystack, String needle) {

        if(needle.equals("") || haystack.equals(needle))
            return 0;

        for(int i = 0; i<=haystack.length()-needle.length(); i++)    //other-wise will result in index out-of-bounds error
        {
            if(haystack.substring(i, i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
}