package com.company;

public class Main{
    public static void main(String []args){
        System.out.println("Great Day");
        method(10);
    }
    static void method(int val)
    {
        if (val == 0)
            return;
        System.out.print(val%2);
        method(val/2);
    } }

