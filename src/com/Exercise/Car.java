package com.Exercise;

public class Car {
    private String model;
    private String year;
    private int price;
    private double discount;




    public Car(String model,String year, int price, double discount){
        this.model = model;
        this.year = year;
        this.price = price;
        this.discount = discount;

    }

    public void setCarYear(String year) {
        this.year = year;
    }

    public void setCarModel(String model) {
        this.model = model;

    }

    public String getModelCar() {
        return  model;
    }

    public String getCarYear() {
        return year;
    }

    public void setPrice(int price) {
        if(price > 0){
            this.price = price;
        }
    }
    public int getPrice() {
        return price;
    }

    public double getPurchaseAmount(){
        double discountAmount = (price * discount) / 100;
        return (price - discountAmount);
    }



}

