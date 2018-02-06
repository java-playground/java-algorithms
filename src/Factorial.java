import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 *
 * Print out the factorial of a number n
 * Uses IntStream.closedRange() to easily a stream to perform aggregate functions on.
 *
 * */
public class Factorial {
    public static void main(String[] args) {

        int n = 1000;
        String factorial = IntStream.rangeClosed(1, n)
            .mapToObj(m -> BigInteger.valueOf(m))
            .reduce(BigInteger.valueOf(1), (a, b) -> a.multiply(b))
            .toString();

        System.out.println(factorial);

    }
}
