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


        /**
         *
         * WALKTHROUGH
         *
         * Set the number to take the factorial of
         * int n = 1000;
         *
         * Essentially create an array from [1, 2, 3, ... n]
         * IntStream.rangeClosed(1, n)
         *
         * Go through every element of the array you just created and turn it into a BigInteger
         * .mapToObj(m -> BigInteger.valueOf(m))
         *
         * Multiply all of the terms into one product using BigInteger's .multiply() method
         * Here BigInteger.valueOf(1) is the initial accumulator value
         * a is the accumulator
         * b is the next element of the array
         * .reduce(BigInteger.valueOf(1), (a, b) -> a.multiply(b))
         *
         * This is obvious
         * .toString()
         *
         */

    }
}
