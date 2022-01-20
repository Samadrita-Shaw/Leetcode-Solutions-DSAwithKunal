/*
     * * * * *
      * * * *
       * * *
        * *
         *
         *
        * *
       * * *
      * * * *
     * * * * *
 */

public class Pattern12 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        for(int row=1; row<=2*n; row++)
        {
            int elementNumber = (row<=n)? n-row+1 : row-n;
            int spaces = (row<=n)? row-1 : 2*n-row;
            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for(int col=1; col<=elementNumber; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
