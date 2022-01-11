//Question: https://leetcode.com/problems/length-of-last-word/

public class Length_of_last {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));

    }
    public static int lengthOfLastWord(String s) {
        s = s.trim();   //removes all leading and trailing spaces
        return (s.length()-1-s.lastIndexOf(" "));  
    }
}
