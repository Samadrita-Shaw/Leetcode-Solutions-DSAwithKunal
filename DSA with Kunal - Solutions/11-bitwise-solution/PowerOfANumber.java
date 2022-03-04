/*
    Calculate a raised to the power b.
 */
public class PowerOfANumber {
    public static void main(String[] args) {
        int base = 3;
        int power = 6;
        int ans = 1;
        while(power>0)
        {
            if((power&1) == 1){
                ans*= base;
            }
            base*= base;
            power= power>>1;
        }
        System.out.println(ans);
    }
}
