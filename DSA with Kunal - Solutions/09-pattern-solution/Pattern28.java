/*
            *
           * *
          * * *
         * * * *
        * * * * *
         * * * *
          * * *
           * *
            *

 */

public class Pattern28 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        for(int row = 0; row<2*n; row++)    //number of rows = 2n-1
        {
            int colInRow = row>n ? 2*n-row : row;   //number of columns to be printed
            int noOfSpaces = n-colInRow;    //number of spaces
            for(int spaces=0; spaces<noOfSpaces; spaces++)  //printing spaces
            {
                System.out.print(" ");
            }
            for(int col = 0; col<colInRow; col++)   //printing the element
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
