//Question: https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/

public class IsSubstring {
    public static void main(String[] args) {
        String word = "aaaaabbbbbc";
        String[] pattern = {"a","abc","bc","d"};
        System.out.println(numOfStrings(pattern, word));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int ctr = 0;
        for (String sub : patterns) {
            if (word.contains(sub))
                ctr++;
        }
        return ctr;
    }
}