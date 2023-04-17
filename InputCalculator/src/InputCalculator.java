import java.util.Scanner;

public class InputCalculator {


    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        double avg = 0;
        int count = 0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                count++;

                    avg = (double)sum / count;
            }
            else{
                break;
            }
        }

        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
        scanner.close();
    }
}
