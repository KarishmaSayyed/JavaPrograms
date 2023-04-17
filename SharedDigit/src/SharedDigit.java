public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2){
        int firstNum;
        int secondNum;
        if((num1 < 10) || (num1 >99) || (num2 < 10) || (num2 > 99)){
            return false;
        }
        while((num1 > 9) || (num2 > 9)){
            firstNum = num1 % 10;
            num1 = num1 / 10;
            secondNum = num2 % 10;
            num2 = num2 / 10;
            if((firstNum == num2) || (firstNum == secondNum) || (num1 == num2) || (num1 == secondNum)){
                return true;
            }
            }
        return false;
        }
    }

