/*
         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
 */

public class Pattern31 {
    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int n)
    {
        for (int row = 1; row <= (2 * n) - 1; row++) {
            for (int col = 1; col <= (2 * n) - 1; col++) {
                int element = n - Math.min(Math.min(row, 2*n-row), Math.min(col, 2*n - col)) + 1;
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}