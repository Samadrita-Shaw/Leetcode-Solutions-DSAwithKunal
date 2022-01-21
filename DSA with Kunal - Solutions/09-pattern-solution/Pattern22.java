/*
       1
       0 1
       1 0 1
       0 1 0 1
       1 0 1 0 1

 */

public class Pattern22 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        int element=1;
        for(int row=1; row<=n; row++)
        {
            element = (row%2==0)? 0 : 1;
            for(int col=1; col<=row; col++)
            {
                System.out.print(element+" ");
                element= (element==0)? 1: 0;
            }
            System.out.println();
        }
    }
}