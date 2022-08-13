package com.Exercise;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter the radius :");
        int radiusNum = scanner.nextInt();

        System.out.printf("the diameter of a circle is : %d%n", (2 * radiusNum));
        System.out.printf("circumference of the circle is: %.2f\n", (2 * (Math.PI * radiusNum)));
        System.out.printf("Area of the circle is %.2f\n", ((radiusNum * radiusNum) * (Math.PI)));

    }

}
