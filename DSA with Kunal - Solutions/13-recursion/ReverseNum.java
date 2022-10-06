import java.util.*;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Reverse of "+num+" is: "+ reverse(num));
    }
    public static int reverse(int n){
        int digits = (int)(Math.log10(n))+1;
        return reverseNum(n, digits);
    }
    public static int reverseNum(int n, int digits){
        if(n%10 == n)
            return n;

        return (n%10)*(int)(Math.pow(10, digits-1))+reverseNum(n/10, digits-1);
    }
}
