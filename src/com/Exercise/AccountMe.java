package com.Exercise;

public class AccountMe {
    private double balance;
    private String pin;


    public double getBalance() {
        return balance;
    }

    public void makeDeposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;

        }

    }

    public void withdraw(double amount, String pin) {
        if(this.pin.equals(pin)){
            if (amount < balance) {
                if (amount > 0) {
                balance = balance - amount;
            }
        }
        }
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

}

