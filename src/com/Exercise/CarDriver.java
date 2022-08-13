package com.Exercise;

public class CarDriver {
    public static void main(String[] args) {
         Car car = new Car("Ford","2003",20000,5);
         Car car2 = new Car("Audi","2012",10000,7);
        System.out.println(car.getPurchaseAmount());
        System.out.println(car2.getPurchaseAmount());
    }
}
