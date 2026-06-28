import java.util.ArrayList;
import java.util.Arrays;

/**
 * This program serves to generate all the prime numbers from 0 to an upperLimiter which in this case is 1000.
 */

public class PrimeNumbers {
    public int limit;
    public PrimeNumbers (int limit) {
        this.limit = limit;
    }

    public static boolean isPrime(int limit) {
        if (limit <= 1) return false;
        if (limit == 2) return true;
        if (limit % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(limit); i += 2) {
            if (limit % i == 0) return false;
        }

        return true;
    }

    /**
     *
     * @param limit is the highest number we are counting our prime numbers upto starting from 3.
     * @return is returning a normal array with a fix size of the total number of the number of prime numbers.
     */

    private static int[] primeNumbersUpto(int limit) {
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        for (int i = 0; i <= limit; i++) {
            if (isPrime(i)) primeNumbers.add(i);
        }

        // We are creating a new array to transfer our prime numbers to.
        int[] result = new int[primeNumbers.size()];

        for (int i = 0; i < primeNumbers.size(); i++) {
            result[i] = primeNumbers.get(i);
        }

        return result;
    }

    public static void main (String[] args) {
        int upperLimit = 100;

        System.out.println("This is the upperLimit: ");
        System.out.println(Arrays.toString(primeNumbersUpto(upperLimit)));
    }

}