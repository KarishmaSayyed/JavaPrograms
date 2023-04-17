public class MinutesToYearDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0){
            System.out.println("Invalid Value");
        }
        long year;
        long remainingMinutes;
        year = minutes / 525600;
        remainingMinutes = minutes % 525600 / 1440;
        System.out.println(minutes + " min = " + year + " y and " + remainingMinutes + " d");
    }
}
