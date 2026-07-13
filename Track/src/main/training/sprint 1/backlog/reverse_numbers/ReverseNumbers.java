/**
 *
 * This program acceps a number and reverses it.
 *  For example, an input of 3956 should return 6593.
 *
 */
public class ReverseNumbers {
    public int numberToReverse;

//    public ReverseNumbers(int num) {
//        this.numberToReverse = num;
//    }

    /**
     * @param num is the number we are reversing.
     * @return is the result of our reverse function.
     */
    private static int reverseNumber(int num) {
        int ourNum = num;
        int result = 0;

        while (ourNum != 0) {
            int digit = ourNum % 10;
            result = result * 10 + digit;
            ourNum /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int ourNum = 3956;
        int ndNum = -3956;
        System.out.println(reverseNumber(ourNum));
        System.out.println(reverseNumber(ndNum));
    }
}