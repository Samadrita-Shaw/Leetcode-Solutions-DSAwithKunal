/*
      1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11

 */

public class Pattern27 {
    public static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int n)
    {
        int first=1, second=n*n+1;
        for(int row=n; row>=1; row--) {
            //printing spaces in the beginning
            for (int k = n; k >= row; k--) {
                System.out.print("  ");
            }
            //printing first/left half
            for (int firstHalfCol = 1; firstHalfCol <= row; firstHalfCol++) {
                System.out.print(first++ + " ");
            }
            //printing second/right half
            for (int secondHalfCol = 1; secondHalfCol <= row; secondHalfCol++) {
                System.out.print(second++ + " ");
            }
            second=(second-1)-((row-1)*2);
            System.out.println();
        }
    }
}
