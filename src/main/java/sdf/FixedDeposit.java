package sdf;

public class FixedDeposit extends BankAccount{

    public static double interest = 3.0;
    public static double duration = 6.0;

    public FixedDeposit(String accountNo, double balance) {
        super(accountNo, balance);
    }

    @Override
    public void deposit(double amount){
        System.out.println("Invalid operation\n");
    }
    @Override
    public void withdraw(double amount){
        System.out.println("Invalid operation\n");
    }
    @Override
    public void showAccount(){
        System.out.println("Account No: " + this.getAccountNo());
        System.out.println("Full name: " + this.getFullName());
        System.out.println("Balance: " + this.getBalance()*((100+interest)/100));
    }
    
}
