import java.util.ArrayList;

public class Problem2 {


    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();

        fibonacci.add(1);
        fibonacci.add(2);

        int i = 0;
        while(true){

            i = fibonacci.getLast() + fibonacci.get(fibonacci.size() - 2);


            if(i <= 4000000){
                fibonacci.add(i);
            } else {
                break;
            }
        }

        int summe = 0;
        for(int number: fibonacci){
            if(number%2 == 0){
                summe += number;
            }
        }
        System.out.println(summe);

    }

}
