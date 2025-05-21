public class Problem4 {

    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int number){

        int original = number;
        int numberReversed = 0;

        while (number != 0) {
            int letzteZiffer = number % 10;
            numberReversed = numberReversed * 10 + letzteZiffer;
            number /= 10;
        }

        return original == numberReversed;
    }

}
