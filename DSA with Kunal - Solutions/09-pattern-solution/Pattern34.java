/*
       E D C B A
       D C B A
       C B A
       B A
       A
 */

public class Pattern34 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        for(int row=n; row>=1; row--)
        {
            for(int col=row; col>=1; col--)
            {
                System.out.print((char)(64+col)+" ");
            }
            System.out.println();
        }
    }
}
