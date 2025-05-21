
import java.util.ArrayList;
import java.time.LocalTime;
import java.time.Duration;
import java.util.Arrays;


public class Problem3 {

    public static void main(String[] args) {
        long number = 600851475143L;

        long rangeL = (long) Math.sqrt((double) number);  // zuerst casten zu double, dann sqrt, dann zu long

        int range = Math.toIntExact(rangeL);

        ArrayList<Integer> primes = getPrimeNumbers(range);

        int biggestPrime = 0;
        for(Integer prime : primes) {
            while (number % prime == 0) {
                biggestPrime = prime;
                number /= prime;
            }
        }

        System.out.println(biggestPrime);

        //Zahl durch erste Primzahl teilen bis nicht mehr geht
        //Wenn Primzahl teilbar war dann als größte Primzahl einspeichern

    }

    public static long divideUntil(long number, long divisor) {

        if(number <= divisor) return number;

        while (true) {
            if (number % divisor == 0) {
                number = number / divisor;
            } else {
                return number;
            }
        }
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
