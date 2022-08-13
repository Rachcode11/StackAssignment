package com.Exercise;

public class Lion extends Animal {

    public Lion(String name, String age, String type) {
        super(name, age, type);
    }
    public String move(){
        return "I AM MOVING";
    }
    @Override
    public String toString(){
        return String.format("Name : %s Age : %s  Type : %s", getName(),getAge(),getType());
    }
}
