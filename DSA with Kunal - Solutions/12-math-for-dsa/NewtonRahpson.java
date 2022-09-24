import java.util.*;
public class NewtonRahpson {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        double n = in.nextDouble();
        System.out.println("Square root of "+n+" is: "+sqrt(n));
    }
    public static double sqrt(double n){
        double x = n;
        double root;

        while(true){
            root = 0.5*(x + (n/x));

            if(Math.abs(root - x)<0.5){
                break;
            }
            x = root;
        }
        return root;
    }
}
