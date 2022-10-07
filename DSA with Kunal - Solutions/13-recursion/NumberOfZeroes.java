import java.util.*;
public class NumberOfZeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter the number: ");
        num = in.nextInt();
        System.out.println("Number of zeroes: "+countZeroes(num));
    }

    public static int countZeroes(int num) {
        if(num == 0)
            return 1;

        return countZeroesHelper(num, 0);
    }

    public static int countZeroesHelper(int n, int c){
        if(n==0)
            return c;

        if(n%10 == 0)
            return countZeroesHelper(n/10, ++c);

        return countZeroesHelper(n/10, c);
    }
}

