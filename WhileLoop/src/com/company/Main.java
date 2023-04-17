package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 2;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }


            System.out.println("Even Number is " + number);
                count++;
            if(count == 5){
                break;
            }
        }

        System.out.println("Total Even Numbers Found Are " + count);
    }

    public static boolean isEvenNumber(int num){
        while(num % 2 == 0){
            return true;
        }
        return false;
    }
}
