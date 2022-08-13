package com.Exercise;

public class AnimalDriver {
    public static void main(String[] args) {
        Lion status = new Lion("lion", "56", "Asiatic");
        System.out.println("My name is :" + status.getName());
        System.out.println("I  am : " + status.getAge());
        System.out.println("I am a : " + status.getType());
        System.out.println("And : " + status.move());

        Dog dog = new Dog("lucky", "12", "American Leopard Hound");
        System.out.println("My name is :" + dog.getName());
        System.out.println("I  am :" + dog.getAge());
        System.out.println("I am a : " + dog.getType());
        System.out.println("And : " + dog.move());

        Monkey monkey = new Monkey("monkey", "10", "Marmoset");
        System.out.println("My name is :" + monkey.getName());
        System.out.println("I  am :" + monkey.getAge());
        System.out.println("I am a : " + monkey.getType());
        System.out.println("And  : " + monkey.move());

        System.out.println("Lion");
        System.out.println("Dog");
        System.out.println("Monkey");
    }


}
