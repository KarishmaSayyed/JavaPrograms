package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true){
            System.out.println("Enter Your Number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();   // nextLine is used to retrieve some input from the console
                if(number > max){
                    max = number;
                }

                if(number < min){
                    min = number;
                }
            }
                else{
                break;
            }
           scanner.nextLine();
        }
        System.out.println("Min: " + min + ",Max: " + max);
        scanner.close();
    }
}
