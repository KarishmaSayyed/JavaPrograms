public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int num) {

        int lastNumber;
        if(num < 0){
            return -1;
        }
            lastNumber = num % 10;
            while (num > 9) {
                num = num / 10;

            }
        return lastNumber + num;
    }

}