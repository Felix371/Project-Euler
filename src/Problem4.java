import java.util.ArrayList;

public class Problem4 {

    public static void main(String[] args) {
        ArrayList<Integer> palindroms = getPalindromes(998001);


        for (int i = palindroms.size() - 1; i >= 0; i--) {
            System.out.println(palindroms.get(i));
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
