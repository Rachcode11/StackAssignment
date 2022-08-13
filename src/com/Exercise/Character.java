package com.Exercise;

import java.util.Scanner;

public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Character");
        char alpahbet = sc.next().charAt(0);

        System.out.printf("The integer value of alphabet %c is %d" , alpahbet , (int) alpahbet);

    }
}
