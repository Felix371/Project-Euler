public class Problem5 {

    public static void main(String[] args) {
        int[] dividers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        int number = 20;
        while(true) {
            boolean isSolution = true;
            for(int divider : dividers) {
                if(number % divider != 0) {
                    isSolution = false;
                    break;
                }
            }
            if(isSolution){
                System.out.println(number);
                break;
            }
            number = number + 20;
        }
    }

}


