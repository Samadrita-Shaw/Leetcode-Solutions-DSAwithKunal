/*
       a
       B c
       D e F
       g H i J
       k L m N o
 */

public class Pattern33 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n)
    {
        char element = 'a';
        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                if( row==1)
                    System.out.print(element);
                else
                {
                    if(element>=97) //element is lowercase
                        element=(char)(element-32); //converting to uppercase
                    else
                        element=(char)(element+32); //converting to uppercase

                    System.out.print(element+" ");
                }
                element++;
            }
            System.out.println();
        }
    }
}
