/*
      **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********
 */

public class Pattern18 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        for(int row=1; row<=2*n; row++)
        {
            for(int col=1; col<=2*n; col++)
            {
                if( row==1 || row==2*n)
                    System.out.print("*");
                else if(row<=n && col>=n-row+2 && col<=n+row-1)
                    System.out.print(" ");
                else if(row>n && col>=row-n+1 && col<=3*n-row)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
