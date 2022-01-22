/*
        *
       * *
      * * *
     * * * *
    * * * * *

 */

public class Pattern10 {
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
            for(int col=1; col<=row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
