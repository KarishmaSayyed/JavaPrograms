public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
            int temp = 0;
            if(number >= 1){
                for(int i = 1; i< number; i++){
                    if(number % i == 0){
                        temp += i;

                    }
                    if(temp == number){
                        return true;
                    }

                }
            }
        return false;
    }
}
