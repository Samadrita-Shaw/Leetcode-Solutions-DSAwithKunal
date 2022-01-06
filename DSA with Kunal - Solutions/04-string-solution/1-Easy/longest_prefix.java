//Question: https://leetcode.com/problems/longest-common-prefix/

public class longest_prefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";

        String prefix = strs[0];    //assuming that the first word is prefix

        for(int i=1; i< strs.length; i++)
        {
            while(strs[i].indexOf(prefix)!=0)   //indexOf() returns -1 if the value doesn't match otherwise returns 0
            {
                prefix=prefix.substring(0, prefix.length()-1);  //reducing the string by 1 letter to check for the prefix.
            }
        }
        return prefix;
    }
}