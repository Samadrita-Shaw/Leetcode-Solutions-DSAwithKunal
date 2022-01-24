/*
         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *

 */

public class Pattern15 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        int colElement=2*n-1;
        for(int row=1; row<=2*n-1; row++)
        {
            int spaces = (row<=n)? n-row : row-n;
            colElement = (row<=n)? 2*row-1 : colElement-2;
            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=colElement; col++)
            {
                if( col==1 || col==colElement)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
