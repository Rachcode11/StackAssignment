package com.Exercise;

public class Animal {
    private String name;
    private String age;
    private String type;

    public Animal(String name, String age, String type){
        this.name = name;
        this.age = age;
        this.type = type;

    }
    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
    public void setAge(String name){
        this.age = age;

    }
    public String getAge(){
        return age;
    }
    public void setType(String type){
        this.type = type;


    }
    public String getType(){
        return type;
    }
    @Override
    public String toString(){
        return String.format("Name: %s Age: %s Animal type : %s",getName(),getAge(),getType());
    }


}

