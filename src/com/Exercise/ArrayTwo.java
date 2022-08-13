package com.Exercise;

public class ArrayTwo {
    public static void main(String[] args) {
        int [] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        System.out.printf("%-10s%s%n", "Index", "Values");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d%10d%n", i, array[i]);

        }
    }
}
