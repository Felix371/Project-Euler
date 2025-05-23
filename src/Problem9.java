import java.util.ArrayList;

public class Problem9 {
    public static void main(String[] args) {


        ArrayList<Integer> naturalNumbers = new ArrayList<>();
        ArrayList<Integer> naturalNumbersSquares = new ArrayList<>();
        int naturalNumber = 1;
        while(true){
            if(naturalNumber <= 997){
                naturalNumbers.add(naturalNumber);
                naturalNumbersSquares.add(naturalNumber*naturalNumber);
                naturalNumber++;
            }else{
                break;
            }
        }


       for(int i = 0; i<naturalNumbers.size()-1; i++){
           for(int j = 1 + i; j<naturalNumbers.size(); j++){
               for (int k = 1 + j; k<naturalNumbers.size(); k++){

                   if(naturalNumbers.get(i) + naturalNumbers.get(j) + naturalNumbers.get(k)==1000 &&
                           naturalNumbersSquares.get(i) + naturalNumbersSquares.get(j) == naturalNumbersSquares.get(k)
                   ){
                       System.out.println(naturalNumbers.get(i) + " +  " + naturalNumbers.get(j) + " + " + naturalNumbers.get(k) + " = " + 1000);
                       System.out.println("und");
                       System.out.println(naturalNumbers.get(i) + "^2 +  " + naturalNumbers.get(j) + "^2 = " + naturalNumbers.get(k)+"^2");
                       System.out.println(naturalNumbers.get(i) + " * " + naturalNumbers.get(j) + " * " + naturalNumbers.get(k) + " = " +
                               naturalNumbers.get(i)*naturalNumbers.get(j)*naturalNumbers.get(k));
                   }




               }
           }
       }


    }
}
