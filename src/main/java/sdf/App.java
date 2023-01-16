package sdf;

import java.util.Random;
import java.util.UUID;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to banking!!");
        int n = 3;
        BankAccount bankAccount[] = new BankAccount[n];

        for (int i = 0; i < bankAccount.length; i++) {
            String uuid = UUID.randomUUID().toString();
            double max = 10000.00;
            double min = 1000.00;
            Random randomNum = new Random();
            double initialBalance = min + randomNum.nextDouble();
            bankAccount[i] = new BankAccount(uuid, initialBalance);

        }
        bankAccount[0].setFullName("Mr Brown");
        bankAccount[1].setFullName("Mr Grey");
        bankAccount[2].setFullName("Mr Pink");
        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();

        bankAccount[0].deposit(6547);
        bankAccount[1].deposit(9375);
        bankAccount[2].deposit(1234);
        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();
        
        bankAccount[0].withdraw(857);
        bankAccount[1].withdraw(214);
        bankAccount[2].withdraw(999);
        bankAccount[0].showAccount();
        bankAccount[1].showAccount();
        bankAccount[2].showAccount();
    }
}
