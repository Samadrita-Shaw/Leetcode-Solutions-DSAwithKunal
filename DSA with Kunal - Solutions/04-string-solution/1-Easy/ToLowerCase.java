//Question: https://leetcode.com/problems/to-lower-case/
//NOTE: This problem can be done by using .toLowerCase() but this is the approach if asked using without inbuilt functions.

public class ToLowerCase {
    public static void main(String[] args) {
        String s = "HereZ";
        System.out.println(toLowerCase(s));

    }
    public static String toLowerCase(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z')
                str.append((char)(ch+32));  //Difference between ASCII Code of capital letters and small letters is 32
            else
                str.append(ch); //if already in lowercase

        }
        return str.toString();
    }
}
