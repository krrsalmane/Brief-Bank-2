
import java.util.Scanner;
import java.util.Date;
public class Operations {
    private String type;


    private int amount;
    Account asociated_account;


    public Operations(String type, int amount,  Account asociated_account) {
        this.type = type;


        this.amount = amount;
        this.asociated_account = asociated_account;
    }
    Scanner sc = new Scanner(System.in);
    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }




    public int getAmount() {
        return amount;
    }


    public void setAmount(int amount) {
        this.amount = amount;
    }


    public Account getAsociated_account() {
        return asociated_account;
    }


    public void setAsociated_account(Account asociated_account) {
        this.asociated_account = asociated_account;
    }
    public static void deposit(Account account, double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            account.addTransaction("Deposit: +" + amount + " on " + new Date());
            System.out.println("Deposit successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    // Method to withdraw money
    public static void withdraw(Account account, double amount) {
        if (amount > 0 && account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            account.addTransaction("Withdrawal: -" + amount + " on " + new Date());
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }



    }
}

