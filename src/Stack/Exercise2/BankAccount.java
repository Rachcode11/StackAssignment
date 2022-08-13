package Stack.Exercise2;

public class BankAccount {
    private int accountnumber;
    private double balance;
    private String accountName;
    private String email;
    private String  phonenumber;


    public void setAccountNumber(int accountnumber){
        if(accountnumber == (2116471341)) {
            this.accountnumber = accountnumber;
        }
    }
    public int getAccountnumber(){
        return this.accountnumber;
    }
    public void setBalance(double balance){
        if (balance == 0){
            this.balance = balance;
        }
    }
    public double getBalance(){
        return this.balance;
    }
    public void setAccountName(String accountName){
        this.accountName = accountName;

    }
    public String getAccountName(){
        return this.accountName;
    }
    public void setEmail(String email){
        this.email = email;

    }
    public String getEmail(){
        return this.email;
    }
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getPhonenumber(){
        return this.phonenumber;
    }
    // creating method for deposit
    public double deposit(double depositAmount){
           this.balance +=depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. new balance is " + this.balance);
        return depositAmount;
    }

    // creating  method for withdraw
    public double withdraw(double withdrawamount){
        if(balance - withdrawamount < 0){
            System.out.println("Only " + balance + " available, withdraw not process ");
        }else{
            this.balance -= withdrawamount;
            System.out.println("Withdrawal of " + withdrawamount + " processed, Remaining balance = " + this.balance);
        }
        return balance;

    }


}
