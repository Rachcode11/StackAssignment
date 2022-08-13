package com.Exercise;

import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = input.nextInt();

        int numb = number / 10000;
        int numb2 = (number % 10000) / 1000;
        int numb3 = ((number % 10000) % 1000) / 100;
        int numb4 = (((number % 10000) % 1000) % 100) / 10;
        int numb5 = (((number % 10000) % 1000) % 100) % 10;

        System.out.printf("%d %d %d %d %d " , numb , numb2 , numb3 , numb4 , numb5);
        }
    }
