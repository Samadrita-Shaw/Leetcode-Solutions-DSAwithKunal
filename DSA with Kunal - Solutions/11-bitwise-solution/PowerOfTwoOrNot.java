/*
    Find out whether the given number is a power of two or not.
 */
public class PowerOfTwoOrNot {
    public static void main(String[] args) {
        int n1 = 16;
        int n2 = 10;
        System.out.println(n1+" is "+powerOfTwo(n1));
        System.out.println(n2+" is "+powerOfTwo(n2));
    }
    public static String powerOfTwo(int n)
    {
        if((n & (n-1))==0)
            return "a power of two.";
        else
            return "not a power of two.";
    }
}
