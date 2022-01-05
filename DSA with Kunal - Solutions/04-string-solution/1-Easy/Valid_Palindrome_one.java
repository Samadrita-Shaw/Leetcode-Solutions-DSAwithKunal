//Question: https://leetcode.com/problems/valid-palindrome/

public class Valid_Palindrome_one {
    public static void main(String[] args) {
        String s = ",";
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {
        s= s.toLowerCase();
        if(s.length()==1)
           return true;

        int i=0, j=s.length()-1;
        while(i<=j)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)))
                i++;

            if(!Character.isLetterOrDigit(s.charAt(j)))
                j--;

            if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j)))
            {
                if(s.charAt(i)== s.charAt(j))
                {
                    i++;
                    j--;
                }
                else
                    return false;
            }
        }

        return true;
    }
}