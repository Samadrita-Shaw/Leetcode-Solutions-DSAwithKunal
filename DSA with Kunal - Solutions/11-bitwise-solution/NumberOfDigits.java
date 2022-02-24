//Question: Find number of digits in base b

public class NumberOfDigits {
    public static void main(String[] args) {
        int n=536;  //number
        int b=10;   //base
        int ans;
        ans =(int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
}
