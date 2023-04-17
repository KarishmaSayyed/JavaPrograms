public class LastDigitChecker {

    public static boolean isValid(int num){
        if( (num > 9) && (num <1000)){
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if((num1 < 9) && (num1 > 1000) || (num2 < 9) && (num2 > 1000) || (num3 < 9) && (num3 > 1000)){
            return false;
        }

    }
}
