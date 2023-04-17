public class SumOddRange {
        public static boolean isOdd(int num){
            if(num < 0){
                return false;
            }
            if(num % 2 != 0){
                return true;
            }
            return false;
        }



        public static int sumOdd(int start, int end) {
            int i;
            int sum = 0;
            if ((start < 0 || end < 0) || (end < start)) {
                return -1;
            }
            for (i = start; i <= end; i++) {
                if (SumOddRange.isOdd(i)) {
                    sum = sum + i;
                }

            }
            return sum;
        }
}
