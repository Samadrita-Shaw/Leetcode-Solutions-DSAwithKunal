/*
         *****
         *****
         *****
         *****
         *****
*/
public class Pattern01 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        for(int row=0; row<n; row++)
        {
            for(int col=0; col<n; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
