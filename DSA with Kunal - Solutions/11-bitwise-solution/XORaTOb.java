/*
    Find XOR of all numbers from a to b.
 */
public class XORaTOb {
    static int xor(int a)
    {
        if(a%4==0)
            return (a);
        else if(a%4==1)
            return (1);
        else if(a%4==2)
            return (a+1);
        else if(a%4==3)
            return (0);

        return 0;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int ans = xor(b)^xor(a-1);
        System.out.println(ans);
    }
}
