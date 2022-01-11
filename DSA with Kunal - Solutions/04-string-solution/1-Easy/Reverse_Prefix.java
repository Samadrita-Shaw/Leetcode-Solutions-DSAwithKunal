//Question: https://leetcode.com/problems/reverse-prefix-of-word/

public class Reverse_Prefix {
    public static void main(String[] args) {
        String word = "abcdefd" ;
        char ch = 'd' ;
        System.out.println(reversePrefix(word, ch));

    }
    public static String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder();
        if(!word.contains(ch+""))   //if the word doesn't contain ch
            return word;

        for (int i = word.indexOf(ch); i >=0 ; i--) {   //indexOf() finds the first occurrence of ch
            str.append(word.charAt(i));
        }
        str.append(word.substring(word.indexOf(ch)+1));
        return str.toString();
    }
}