/*
    Given a number n, find the number of set bits in it.
 */
public class NumberOfSetBits {
    public static void main(String[] args) {
        int n= 25;
        System.out.println("Number in binary= "+Integer.toBinaryString(n));
        int count = 0;
        while (n>0){
            count++;
            n= n&(n-1);
        }
        System.out.println("Number of set-bits= "+count);
    }
}
