package com.Exercise;

import java.util.Scanner;

public class NPZ {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        // declare variable

//        int num2 ;
//        int num3 ;
//        int num4 ;
//        int num5 ;
        int numPositive = 0;
        int numNegative = 0;
        int zeroValue  = 0;
        for (int i = 1; i < 10; i++ ){
            System.out.printf("Enter input %d :%n", i);
            int num1 = value.nextInt();

            if (num1 > 0) {
                numPositive++;
            }
            if(num1 < 0){
                numNegative++;
            }
            if(num1 == 0){
                zeroValue++;
            }
            }
        System.out.printf("Positive Number = %d%n",numPositive);
        System.out.printf("Negative Number = %d%n",numNegative);
        System.out.printf("Zero Value = %d%n", zeroValue);
        //Reset Negative Positive Zero value
//
//        int numNegative = 0;
//        int numPositive = 0;
//        int numZero = 0;
//
//        // Ask user for input
//        System.out.println("Enter your input :");
//        num1 = value.nextInt();
//
//        System.out.println("Enter your input :");
//        num2 = value.nextInt();
//
//        System.out.println("Enter your input :");
//        num3 = value.nextInt();
//
//        System.out.println("Enter your input :");
//        num4 = value.nextInt();
//
//        System.out.println("Enter your input :");
//        num5 = value.nextInt();
//
//        // count positive
//        if(num1 > 0){
//            numPositive = numPositive + 1;
//        }
//        if(num2 > 0){
//            numPositive = numPositive + 1;
//        }
//        if(num3 > 0){
//            numPositive = numPositive + 1;
//        }
//        if(num4 > 0){
//            numPositive = numPositive + 1;
//        }
//        if(num5 > 0){
//            numPositive = numPositive + 1;
//
//            // count positive
//
//            if(num1 < 0){
//                numNegative = numNegative + 1;
//
//            }
//            if(num1 > 0){
//                numNegative = numNegative + 1;
//
//            }
//            if(num1 > 0){
//                numNegative = numNegative + 1;
//
//            }
//            if(num1 > 0){
//                numNegative = numNegative + 1;
//
//            }
//            if(num5 > 0){
//                numNegative = numNegative + 1;
//
//            }
//
//            // count Zerfo value
//
//            if(num1 == 0){
//                numZero = numZero + 1;
//            }
//            if(num2 == 0){
//                numZero = numZero + 1;
//            }
//            if(num3 == 0){
//                numZero = numZero + 1;
//            }
//            if(num4 == 0){
//                numZero = numZero + 1;
//            }
//            if(num5 == 0){
//                numZero = numZero + 1;
//
//                System.out.println("\n");
//
//                // display


    }
}
