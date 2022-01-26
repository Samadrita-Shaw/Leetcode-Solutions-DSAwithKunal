/*
       *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *

 */

public class Pattern19 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        for(int row=1; row<=2*n-1; row++)
        {
            for(int col=1; col<=2*n; col++)
            {
                if(row==n)
                    System.out.print("*");

                else if(row<=n && col<=row || row<=n && col>2*n-row)
                    System.out.print("*");

                else if(row>n && col<=2*n-row || row>n && col>=row+1)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
