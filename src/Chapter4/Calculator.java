package Chapter4;

public class Calculator {
    private int accountNo;
    private int startBalance;
    private int creditLimit;
    private int totalCharges;
    private int totalCredit;

    public Calculator(int accountNo, int startBalance, int creditLimit, int totalCharges, int totalCredit) {
        this.accountNo = accountNo;
        this.startBalance = startBalance;
        this.creditLimit = creditLimit;
        this.totalCharges = totalCharges;
        this.totalCredit = totalCredit;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getStartBalance() {
        return startBalance;
    }

    public void setStartBalance(int startBalance) {
        this.startBalance = startBalance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public int getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(int totalCharges) {
        this.totalCharges = totalCharges;
    }

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }
    public int getNewBalance(){
        return getStartBalance() - getTotalCharges() + getTotalCredit();
    }
    public boolean creditExceeded(){
        return (getNewBalance() > getCreditLimit())?false : true;
    }
}
