//Question: https://leetcode.com/problems/shuffle-string/

public class Shuffle_String {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s, indices));

    }
    public static String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray();    //character array
        for(int i = 0; i< indices.length; i++)
        {
            ch[indices[i]] = s.charAt(i);
        }
        return new String(ch);  //since ch was a char array, we need to store it as string then return
    }
}