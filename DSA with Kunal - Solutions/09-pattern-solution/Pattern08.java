/*
            *
           ***
          *****
         *******
        *********
 */

public class Pattern08 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int k=1; k<=n-row; k++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}