package com.Exercise;

import java.util.Scanner;

public class Comparing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer : ");
        int number = input.nextInt();

        int squareOfNumber = number * number;

        if (number == 100) {
            System.out.printf("%d == %d%n", number, 100);
        }

        if (number != 100) {
            System.out.printf("%d != %d%n", number, 100);
        }
        if (number < 100) {
            System.out.printf("%d < %d%n", number, 100);

        }
        if (number > 100) {
            System.out.printf("%d > %d%n", number , 100);
        }
        if (squareOfNumber == 100) {
            System.out.printf("%d == %n", squareOfNumber);
        }
        if (squareOfNumber != 100) {
            System.out.printf("%d %n", squareOfNumber);
        }
        if (squareOfNumber < 100){
            System.out.printf("%d < %n", squareOfNumber);
        }
        if (squareOfNumber > 100){
            System.out.printf("%d > %n", squareOfNumber);
        }


    }

}