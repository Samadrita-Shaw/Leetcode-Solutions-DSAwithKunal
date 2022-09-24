import java.util.*;
public class FactorsOptimized {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = in.nextInt();
        factors(n);
    }

    private static void factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n%i==0){
                if((n/i)==i){
                    System.out.print(i+ " ");
                }
                else{
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i)+ " ");
        }
    }
}
