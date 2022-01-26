/*
       *        *
       **      **
       * *    * *
       *  *  *  *
       *   **   *
       *   **   *
       *  *  *  *
       * *    * *
       **      **
       *        *

 */

public class Pattern24 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        for(int row=1; row<=2*n; row++)
        {
            for(int col=1; col<=2*n; col++)
            {
                if( col==1 || col==2*n || col==row || col==2*n-row+1 )
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
