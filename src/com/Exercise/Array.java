package com.Exercise;

public class Array {
    public static void main(String[] args) {
         int[] array = {5, 8, 9, 2, 3, 6, 4};
        System.out.printf("%-10s%s%n", "Index", "Values");
        for (int i = 0; i < array.length; i++) {

            System.out.printf("%d%10d%n", i, array[i]);

        }
    }
}
