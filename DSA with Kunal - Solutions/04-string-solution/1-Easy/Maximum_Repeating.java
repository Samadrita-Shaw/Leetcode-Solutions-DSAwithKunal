//Question: https://leetcode.com/problems/maximum-repeating-substring/

public class Maximum_Repeating {
    public static void main(String[] args) {
        String sequence = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
        String word = "aaaba";
        System.out.println(maxRepeating(sequence, word));
    }
    public static int maxRepeating(String sequence, String word) {
        if(sequence.equals(word))
            return 1;

        if(word.length()>sequence.length())
            return 0;

        int k=0;
        String temp=word;   //this will be storing k repeating string
        for(int i=0; i<(sequence.length()/word.length()); i++ ) {   //k can be max sequence.length()/word.length()
            if(sequence.contains(temp))
            {
                k++;
                temp+=word; //k repeating string
            }
        }
        return k;
    }
}