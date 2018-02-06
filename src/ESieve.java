/**
 *
 * Implementation of the Sieve of Eratosthenes for finding primes
 *
 */
public class ESieve {

    public static void main(String[] args) {

        // maximum number to find primes up to
        int n = 100;

        // creating array from 2 to n with default value true
        boolean[] A = new boolean[n+1];
        for(int i = 2; i <= n; i++) {
            A[i] = true;
        }

        // sieving primes
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(A[i]) {
                for(int j = i*i; j <= n; j += i) {
                    A[j] = false;
                }
            }
        }

        // print out the primes
        for(int i = 2; i <= n; i++) {
            if(A[i]) {
                System.out.println(i);
            }
        }

    }
}
