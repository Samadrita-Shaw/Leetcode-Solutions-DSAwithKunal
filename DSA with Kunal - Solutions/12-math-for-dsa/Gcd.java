import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a and b: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("G.C.D: "+gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if(a==0)
            return b;
        return gcd(b%a, a);
    }
}
