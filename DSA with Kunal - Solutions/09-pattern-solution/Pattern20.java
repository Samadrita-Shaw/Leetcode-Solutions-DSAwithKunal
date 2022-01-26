/*
       ****
       *  *
       *  *
       *  *
       ****
 */

public class Pattern20 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<n; col++)
            {
                if( row==1 || row==n || col==1 || col==n-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
