package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while (true){

            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");
            Boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int number = scanner.nextInt();
                counter ++;
                sum += number;
                if(counter == 10){
                    break;
                }
            }
            else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();
    }
}
