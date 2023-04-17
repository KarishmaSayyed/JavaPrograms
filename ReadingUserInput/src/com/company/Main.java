package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your BirthYear: ");

        Boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2022 - yearOfBirth;
            if(age >= 0 && age <= 100){
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else{
                System.out.println("Invalid Year of birth");
            }

        }else{
            System.out.println("Unable to parse birth year");
        }

        scanner.close();
    }
}
