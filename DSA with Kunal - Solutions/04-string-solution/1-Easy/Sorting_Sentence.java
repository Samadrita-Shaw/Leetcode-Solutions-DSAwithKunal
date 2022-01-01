//Question: https://leetcode.com/problems/sorting-the-sentence/

public class Sorting_Sentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));

    }
    public static String sortSentence(String s) {
        String[] words = s.split(" ");  //creating a String Array consisting of the words
                                                //s.split(" ") is making an array with elements splitting at " "
        String[] sorted = new String[words.length]; //for storing the sorted answer
        for(String word : words)
        {
            int order = word.length()-1; //extracting the order digit index
            sorted[word.charAt(order)-'1'] = word.substring(0, order);
        }
        return String.join(" ", sorted);
    }
}