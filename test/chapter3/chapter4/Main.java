package chapter3.chapter4;

import Stack.Exercise2.BankAccount;

public class Main {
    public static void main(String[] args) {
        // creating object
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(2116471341);
        bankAccount.setAccountName("Joseph Abimbola Racheal");
        bankAccount.setBalance(0.00 );
        bankAccount.setEmail("holuwanifemijoke@gmail.com");
        bankAccount.setPhonenumber("+2349045830013");
        System.out.println("Accountnumber is : " + bankAccount.getAccountnumber());
        System.out.println("AccountName is : " + bankAccount.getAccountName());
        System.out.println("Balance is : " + bankAccount.getBalance());
        System.out.println("Email is : " + bankAccount.getEmail());
        System.out.println("PhoneNumber is : " + bankAccount.getPhonenumber());
        double deposit = bankAccount.deposit(3000);
//        System.out.printf("%s%.2f%n", "Deposit amount is : ", deposit);

        double withdraw = bankAccount.withdraw(3000);
        System.out.printf("%s%.2f%n","Withdraw amount is : ", withdraw );
        bankAccount.withdraw(3000);
        System.out.println("insufficent fund");


    }
}
