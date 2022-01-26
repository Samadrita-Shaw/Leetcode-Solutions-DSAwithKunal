/*
          *****
         *   *
        *   *
       *   *
      *****
 */

public class Pattern25 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=2*n-1; col++)
            {
                if(col<=n)
                {
                    if(row==n || col==n-row+1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                else
                {
                    if(row==1 || col==2*n-row)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
