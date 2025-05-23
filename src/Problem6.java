public class Problem6 {
    public static void main(String[] args) {

        int range = 100;


        int[] numbers = new int[range];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }


        System.out.println(calcSquareOfSum(numbers)-calcSumOfSquares(numbers));

    }

    public static int calcSumOfSquares(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number*number;
        }
        return sum;
    }

    public static int calcSquareOfSum(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum*sum;
    }

}
