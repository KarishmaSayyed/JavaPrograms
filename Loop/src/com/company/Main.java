package com.company;

public class Main {

    public static void main(String[] args) {

       /*     for(int i = 2; i < 9 ; i++){
                System.out.println("10000 at " + i + "% interest = "+ calculateInterest(10000,i));
            }

        System.out.println("********************************");

            for(int i = 8; i > 1 ; i--){
            System.out.println("10000 at " + i + "% interest = "+ String.format("%.2f",calculateInterest(10000,i)));
        }  */

        /*  for(int i = 2; i<=8; i++){
            System.out.println();      */
         /*      int count = 0;
               for(int i = 10; i<= 50; i++){
                   if(isPrime(i)){
                       count ++;
                       System.out.println("The number " + i + " is a prime number.");
                   }
                   if(count == 3){
                       System.out.println("Existing the loop");
                       break;
                   }

               }*/
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            int no = i;

            if (no% 3 == 0 && no % 5 == 0) {
                 count ++;
                 sum = sum + i;
                System.out.println(i);

            }
            if (count == 5) {
                System.out.println(sum);
                break;

            }
        }
    }
}


 /*   public static double calculateInterest(double amount, double interest){
            return (amount * (interest / 100));
    }

    public static boolean isPrime(int n){
        int i;

            if(n == 1){
                return false;
            }
            for( i = 2; i<= n/2; i++){
                if(n % i == 0){
                    return false;
                }
            }
        return true;
    }
}
*/