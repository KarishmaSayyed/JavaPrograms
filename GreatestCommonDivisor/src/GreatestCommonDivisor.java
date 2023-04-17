public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        int t1 =0;
        int t2 = 0;

        int common = 0;
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        for (int i = 1; i <= first; i++) {
            if (first % i == 0) {
                t1 = i;
            }
            for (int j = 1; j <= second; j++) {
                if (second % j == 0) {
                    t2 = j;

                }
                if (t1 == t2) {
                    common = t2;
                }
            }

        }
        return common;
    }
}