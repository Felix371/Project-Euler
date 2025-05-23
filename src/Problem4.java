import java.util.ArrayList;
import java.util.Arrays;

public class Problem4 {

    public static void main(String[] args) {
        ArrayList<Integer> palindroms = getPalindromes(998001);


        int[] numbers = new int[900];
        for (int i = 0; i < 900; i++) {
            numbers[i] = i + 100;
        }




        for (int i = palindroms.size() - 1; i >= 0; i--) {
            for(int j = 899; j >= 0; j--) {
                double result = (double) palindroms.get(i) / numbers[j];

                if(result % 1 == 0 && result > 99 && result < 1000) {
                    System.out.println(result + " * " + numbers[j] + " = " + palindroms.get(i));
                }
            }


        }

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

    public static ArrayList<Integer> getPalindromes(int range){
        ArrayList<Integer> palindroms = new ArrayList<Integer>();
        for(int i = 1; i <= range; i++) {
            if(isPalindrome(i)) {
                palindroms.add(i);
            }
        }
        return palindroms;
    }

}
