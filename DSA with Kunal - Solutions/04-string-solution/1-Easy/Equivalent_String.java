//Question: https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
//NOTE: Can use here StringBuilder too.

public class Equivalent_String {
    public static void main(String[] args) {
        String[] s1 = {"a", "cb"};
        String[] s2 = {"ab", "c"};
        System.out.println(arrayStringsAreEqual(s1, s2));

    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if(String.join("",word1).equals(String.join("",word2)))
            return true;

        return false;
    }
}