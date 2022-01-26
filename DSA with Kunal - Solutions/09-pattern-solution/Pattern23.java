/*
      *      *
    *   *  *   *
   *     *       *

 */

public class Pattern23 {
    public static void main(String[] args) {
        pattern(3);
    }
    public static void pattern(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=3*n; col++)
            {
                if( col==n-row+1 || col==3*n-row-1 || (row==n && col==3*n))
                    System.out.print("* ");
                else if( row==2 && col==2*row || row==2 && col==4*row)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}