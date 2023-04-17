package com.company;

public class Overloading {

        public static double calcFeetAndInchesToCentimeter(double feet, double inches){
            if((feet >=0) && (inches >=0 || inches <=12)){
                double centimeter;
                centimeter = feet * 30.48;
                centimeter += inches * 2.54;
                System.out.println(feet + " feet, " + inches + " inches = " + centimeter + " centimeters.");
                return (centimeter);

            }
            System.out.println("invalid data");
            return -1;

        }


    public static double calcFeetAndInchesToCentimeter(double inches){
            if(inches <0){
                return -1;
            }

            double feet;
            feet = inches / 12;
            int remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
        return (calcFeetAndInchesToCentimeter(feet, remainingInches));
    }
    }

