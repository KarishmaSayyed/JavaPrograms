package com.company;

public class Main {

    public static void main(String[] args) {
/*	        int value = 2;
            if(value == 1 ){
                System.out.println("Value is one");
            }
            else if(value == 2){
                System.out.println("Value is two");
            }
            else {
                System.out.println("Value is neither 1 nor 2");
            }   */

      /*  int switchValue = 4;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("It was a 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Value was neither 1 or 2");
                break;

        }              */

        char value = 'D';
        switch(value){
            case 'A':
                System.out.println("character is A");
                break;

            case 'B':
                System.out.println("character is B");
                break;

  /*          case 'C':
                System.out.println("character is C");
                break;

            case 'D':
                System.out.println("character is D");
                break;

            case 'E':
                System.out.println("character is E");
                break;          */

            case 'C': case'D': case 'E':

                System.out.println( value + " was found");
                break;

            default:
                System.out.println("Not Found");
                break;




        }


    }
}
