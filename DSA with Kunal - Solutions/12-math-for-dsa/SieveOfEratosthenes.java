public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }
    public static void sieve(int n, boolean[] primes){
        for(int i = 2; i*i <=n ; i++) {
            if(!primes[i]){
                for (int j = i*2; j <=n ; j+=i) {   //making the multiples true, i.e. visited and are primes
                    primes[j]=true;
                }
            }
        }
        System.out.println("Prime numbers in the range are: ");
        for (int i = 2; i <=n ; i++) {
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
}