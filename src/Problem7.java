import java.util.ArrayList;
import java.util.Arrays;

public class Problem7 {
    public static void main(String[] args) {

        ArrayList<Integer> primes = getPrimeNumbers(1000000);
        System.out.println(primes.get(10000));
    }

    public static ArrayList<Integer> getPrimeNumbers(int range) {
        boolean[] numbers = new boolean[range + 1];
        Arrays.fill(numbers, true);
        numbers[0] = false;
        numbers[1] = false;
        for (int i = 2; i * i <= range; i++) {
            if (numbers[i]) {
                for(int j = i * i; j <= range; j += i) {
                    numbers[j] = false;
                }
            }
        }
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= range; i++) {
            if (numbers[i]) {
                primes.add(i);
            }
        }
        return primes;

    }
}
