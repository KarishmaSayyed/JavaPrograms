package com.company;

public class Main {

    public static void main(String[] args) {

        int feet = (calcFeetAndInchesToCentimeter(100));
        calcFeetAndInchesToCentimeter(feet,5);

        Overloading.calcFeetAndInchesToCentimeter(150);
    }

    public static int calcFeetAndInchesToCentimeter(double feet, double inches){
        if(feet >=0 && (inches >=0 && inches <=12)){
            int feetToCm;
            double inchToCm;
            feetToCm =  (int)(feet * 30.48);
            inchToCm = (int)(inches * 2.54);
            System.out.println(feet + " feet is " + feetToCm + " Centimeters and " + inches + " inches are " + inchToCm + " Centimeters");
        }
        return -1;
    }

    public static int calcFeetAndInchesToCentimeter(double inches){
        if(inches >=0){
            int feet = (int)(inches / 12);
            System.out.println(inches + " inches are equal to " + feet + " feet ");
        }
        return 1;
    }
}
