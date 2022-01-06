//Question: https://leetcode.com/problems/valid-palindrome-ii/

public class Valid_Palindrome_Two {
    public static void main(String[] args) {
        String s = "ebcbbececabbacecbbcbe";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int i=0, j=s.length()-1;
        if(s.length()==1)
            return true;

        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return (checkPalindrome(s, i+1, j) || checkPalindrome(s, i, j-1));  //will check if the rem is palindrome or not if either first character or last character is removed.
            }
        }
        return true;
    }

    public static boolean checkPalindrome(String s, int start, int end) //checking for the remaining part
    {
        while(start<end)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                start++;
                end--;
            }
            else
                return false;
        }
        return true;
    }
}