package com.Exercise;

public class PetrolPurchaseDriver {
    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("yaba", 3,
                "OCTANE_REGULAR",200,10);
        System.out.println("The amount to pay after discount deduction is: "+petrolPurchase.getPurchaseAmount());
    }
}
