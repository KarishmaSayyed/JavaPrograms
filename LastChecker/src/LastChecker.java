public class LastChecker {

    public static boolean isValid(int num) {
        if ((num > 9) && (num <= 1000)) {
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        int temp1;
        int temp2;
        int temp3;
        if ( isValid(num1) && isValid(num2) && isValid(num3) ) {

           temp1 = num1%10;
           temp2 = num2%10;
           temp3 = num3%10;

           return ((temp1 == temp2) || (temp2 == temp3) || (temp1 == temp3));


        }
            return false;
        }
    }

