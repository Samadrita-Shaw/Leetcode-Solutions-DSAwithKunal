// Question: Check whether a number is odd or not.

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(CheckIfOdd(45));
    }
    public static boolean CheckIfOdd(int n)
    {
        return (n&1)==1;
    }
}
