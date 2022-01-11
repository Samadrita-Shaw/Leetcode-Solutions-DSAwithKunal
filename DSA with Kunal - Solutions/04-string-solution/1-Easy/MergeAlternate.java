//Question: https://leetcode.com/problems/merge-strings-alternately/

public class MergeAlternate {
    public static void main(String[] args) {
        String word1 = "ad", word2 = "pq";
        System.out.println(mergeAlternately(word1, word2));
    }
    public static String mergeAlternately(String word1, String word2) {
        int i=0, j=0;
        StringBuilder str = new StringBuilder();
        while (i<word1.length() && j<word2.length())
        {
            str.append(word1.charAt(i));
            i++;
            str.append(word2.charAt(j));
            j++;
        }
        while (i<word1.length())
        {
            str.append(word1.charAt(i));
            i++;
        }
        while (j<word2.length())
        {
            str.append(word2.charAt(j));
            j++;
        }
        return str.toString();

    }
}
