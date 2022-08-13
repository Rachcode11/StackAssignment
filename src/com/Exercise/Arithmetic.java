package com.Exercise;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int first = input.nextInt();
        System.out.println("Enter second integer: ");
        int second = input.nextInt();
        System.out.println("Enter third integer: ");
        int third = input.nextInt();

        int sum = first + second + third;
        int product = first * second * third;
        int avg = (first + second + third) / 3;

        System.out.printf("Sum of integer is : %d%n", sum);
        System.out.printf("Product integer is : %d%n", product);
        System.out.printf("Average of integer is : %d%n", avg);;

        if (first > second){
            System.out.printf("largest is : %d%n", first);
        }
        if (second > third){
            System.out.printf("largest is : %d%n", second);
        }
        if(third > first){
            System.out.printf("largest is : %d%n", third);
        }
        if (first < second){
            System.out.printf("smallest is : %d%n", first);
        }
        if (second < third){
            System.out.printf("smallest is : %d%n", second);
        }
        if(third < first){
            System.out.printf("smallest is : %d%n", third);
        }




    }

}
