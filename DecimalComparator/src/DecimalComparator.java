public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
        int first = (int) (firstNumber * 1000);
        int second = (int) (secondNumber * 1000);
        if(first - second == 0){
            return true;
        }
        return false;
    }

}
