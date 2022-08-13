package com.Exercise;

public class Dog extends Animal{
    public Dog(String name, String age, String type) {
        super(name, age, type);
    }
    public String move(){
        return "i am moving ";
    }
    @Override
    public String toString(){
        return String.format("Name: %s Age: %s Animal type : %s",getName(),getAge(),getType());
    }
}
