//Question: https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/

 public class Contiguous_BinaryOne {
     public static void main(String[] args) {
         String s="110";
         System.out.println(checkOnesSegment(s));

     }
     public static boolean checkOnesSegment(String s) {
         if(s.length()==1)
             return true;

         for (int i = 1; i < s.length(); i++) {
             if(s.contains("01"))   //if it contains 01, it means it has either multiple contiguous 1s or no contiguous 1s and thus should return false.
                 return false;
         }
         return true;
     }
}