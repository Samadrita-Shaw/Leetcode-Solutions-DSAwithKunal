/*
      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6
 */

public class Pattern26 {
    public static void main(String[] args) {
        pattern(6);
    }
    public static void pattern(int n)
    {
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=n-row+1; col++)
            {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
