/*
             *
             **
             ***
             ****
             *****
             ****
             ***
             **
             *

 */

public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n){
        for(int row = 0; row<2*n; row++)    //number of rows = 2n-1
        {
            int colInRow = row>n ? 2*n-row : row;   //number of columns to be printed
            for(int col = 0; col<colInRow; col++)   //printing the element
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
