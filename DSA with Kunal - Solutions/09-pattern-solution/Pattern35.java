/*
       1      1
       12    21
       123  321
       12344321
 */

public class Pattern35 {
    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                    System.out.print(col);
            }
            for(int k=2*row; k<=2*n; k++)   //spaces
                System.out.print(" ");

            for (int col=row; col>=1; col--)
                System.out.print(col);

            System.out.println();
        }
    }
}
