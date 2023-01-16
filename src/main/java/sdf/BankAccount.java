package sdf;

import java.util.Date;

public class BankAccount {

    private final String accountNo;
    private String fullName;
    private double balance = 0;
    private boolean isActive = true;
    private Date accountStartDate;
    private Date accountEndDate;
    public String getAccountNo() {
        return accountNo;
    }
    

    public BankAccount(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void deposit (double amount){
        if(!isActive){
            throw new IllegalArgumentException("You cannot deposit in an inactive bank account.");
        }
        if(amount < 0){
            throw new IllegalArgumentException("You cannot make negative deposits.");

        } else{
            balance += amount;

        }
    }

    public void withdraw (double amount){
        if(!isActive){
            throw new IllegalArgumentException("You cannot withdraw from an inactive bank account.");
        } 
        if (balance < amount){
            throw new IllegalArgumentException("Amount is more than balance.");
        } else{
            balance -= amount;
        }
    }


    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
    public Date getAccountStartDate() {
        return accountStartDate;
    }
    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }
    public Date getAccountEndDate() {
        return accountEndDate;
    }
    public void setAccountEndDate(Date accountEndDate) {
        this.accountEndDate = accountEndDate;
    }

    public void showAccount(){
        System.out.println("Account No: " + accountNo);
        System.out.println("Full name: " + fullName);
        System.out.println("Balance: " + balance);
    }
    @Override
    public String toString() {
        return "BankAccount [accountNo=" + accountNo + ", fullName=" + fullName + ", balance=" + balance + ", isActive="
                + isActive + ", accountStartDate=" + accountStartDate + ", accountEndDate=" + accountEndDate + "]";
    }
    
}
