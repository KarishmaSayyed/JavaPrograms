package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(9));
        System.out.println(sumDigits(953435));

    }

    public static int sumDigits(int number){
        int rem;
        int sum = 0;
        if(number < 10){
            return -1;
        }
        else{
            while (number != 0){
                rem = number % 10;
                sum = sum + rem;
                number = number / 10;
            }

        }
        return sum;
    }
}
