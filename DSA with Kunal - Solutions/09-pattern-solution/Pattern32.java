/*
       E
       D E
       C D E
       B C D E
       A B C D E
 */

public class Pattern32 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        for(int row=n; row>=1; row--)
        {
            for(int col=row; col<=n; col++)
            {
                System.out.print((char)(64+col)+" ");
            }
            System.out.println();
        }
    }
}
