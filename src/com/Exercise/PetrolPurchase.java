package com.Exercise;

public class PetrolPurchase {
    private String location;
    private double quantity;
    private PetrolType typeOfPetrol;
    private int pricePerLitre;
    private double percentageDiscount;


    public PetrolPurchase(String location, int quantity, String typeOfPetrol, int pricePerLitre, int percentageDiscount){
       this.location = location;
       this.quantity = quantity;
       this.typeOfPetrol = PetrolType.valueOf(typeOfPetrol);
       this.pricePerLitre = pricePerLitre;
       this.percentageDiscount = percentageDiscount;

    }

    public String getLocation() {
        return location;
    }
    public void setQuantity(double quantity) {
        this.quantity =  quantity;

    }

    public double getQuantity() {
        return quantity;
    }

    public PetrolType getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = PetrolType.valueOf(typeOfPetrol);
    }

    public void setPricePerLitre(int pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public int getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public double getPurchaseAmount() {
        double discountAmount = (quantity * pricePerLitre) * (percentageDiscount/ 100);
        return (quantity * pricePerLitre) - discountAmount;
        }

    }

