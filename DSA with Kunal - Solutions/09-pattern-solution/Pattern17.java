/*
         1
        212
       32123
      4321234
       32123
        212
         1
 */

public class Pattern17 {
    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int n)
    {
        for(int row=1; row<2*n; row++)
        {
            int colStartValue= row>n ? 2*n-row : row;
            for(int spaces=1; spaces<=n-colStartValue; spaces++)
            {
                System.out.print("  ");
            }
            for (int col=colStartValue; col>=1; col--)
            {
                System.out.print(col+ " ");
            }
            for (int col=2; col<=colStartValue; col++)
            {
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}
