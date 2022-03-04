import java.util.Arrays;

/*
    Flip a 2D Array: reverse + invert(complement).
 */
public class FlippingOfImage
{
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}};
        for (int[] row:
             image) {
            for (int i = 0; i < (image[0].length +1 )/2; i++) {
                int temp = row[i]^1;
                row[i]= row[image[0].length-i-1]=temp;
            }
        }
        for (int i = 0; i < image.length; i++) {
            System.out.println(Arrays.toString(image[i]));
        }

    }
}
