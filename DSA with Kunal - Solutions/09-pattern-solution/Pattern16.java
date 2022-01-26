/*
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1

 */

public class Pattern16 {
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
                if( col==1 || row==n || col==2*row-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
