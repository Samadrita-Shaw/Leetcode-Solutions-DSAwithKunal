//Question: https://leetcode.com/problems/determine-if-string-halves-are-alike/

public class Alike_Halves {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));

    }
    public static boolean halvesAreAlike(String s) {
        String word1 = s.substring(0, s.length()/2).toLowerCase();
        String word2 = s.substring(s.length()/2).toLowerCase();
        int ctr1 = 0, ctr2 = 0;
        for(int i=0; i<word1.length(); i++)
        {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            if(ch1 == 'a' || ch1 == 'e' || ch1 == 'i' || ch1 == 'o' || ch1 == 'u' )
                ctr1 ++;

            if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u' )
                ctr2 ++;
        }
        return ctr1==ctr2;
    }
}