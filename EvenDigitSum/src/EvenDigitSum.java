public class EvenDigitSum {

    public static int getEvenDigitSum(int num){
        int rem;
        int sum = 0;

        if(num < 0){
            return -1;
        }
        while(num > 0){
            rem = num % 10;
            if(rem %2 == 0){
                sum += rem;
            }
            num = num / 10;
        }
        return sum;
    }
}
