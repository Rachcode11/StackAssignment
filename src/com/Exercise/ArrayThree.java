package com.Exercise;

public class ArrayThree {
    public static void main(String[] args) {
        int [] array = {7, 53, 30, 26, 14, 10, 8, 1};
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            total = total + array[i];


        }
        System.out.printf("%d", total);

    }
}
