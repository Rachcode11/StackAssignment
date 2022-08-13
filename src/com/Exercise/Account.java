package com.Exercise;

public class Account {
    private int balance;
    private String pin;
    public int getBalance(String Pin) {
        return balance;
    }

    public void getDeposit(int amount) {
        if(amount > 0){
            balance = getBalance("2325")  + amount;
        }
    }

    public int getWithdraw(int amount, String pin) {
        if(amount > balance){
            return balance;

        }
        return balance;

    }


}
