//Question: https://leetcode.com/problems/split-two-strings-to-make-palindrome/

public class Split_Palindrome {
    public static void main(String[] args) {
        String a="ulacfd", b="jizalu";
        System.out.println(checkPalindromeFormation(a, b));
    }
    public static boolean checkPalindromeFormation(String a, String b) {
        if(isPalindrome(a, 0, a.length()-1) || isPalindrome(b, 0, b.length()-1))
        {
            return true;    //if either of the string is palindrome, answer is palindrome
        }
        return (splitStringPalindrome(a, b) || splitStringPalindrome(b, a));
    }
    public static boolean splitStringPalindrome(String a, String b)
    {
        int start =0, end = a.length()-1;
        while (start<end)
        {
            if(a.charAt(start)==b.charAt(end))
            {
                start++;
                end--;
            }
            else
                break;
        }
        return (isPalindrome(a, start, end) || isPalindrome(b, start, end));


    }
    public static boolean isPalindrome(String a, int start, int end)
    {
        while (start<end)
        {
            if(a.charAt(start)!=a.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}
