//Question: https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class Reverse_String_word {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] sen = s.split(" ");    //creates array of words
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < sen.length; i++) {
            for (int j = sen[i].length()-1; j >=0; j--) {
                str.append(sen[i].charAt(j));
            }
            if(i!= sen.length-1)
            str.append(" ");
        }
        return str.toString();
    }
}