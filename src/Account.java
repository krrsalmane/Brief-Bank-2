import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public abstract class Account {
    Scanner sc = new Scanner(System.in);


    private int account_number;
    private double balance;
    Client owner;
    private String account_type;
    private List<String> transactionHistory;




    public Account(int account_number, double balance, Client owner) {
        this.account_number = account_number;
        this.balance = balance;
        this.owner = owner;
        this.transactionHistory = new ArrayList<>();
    }


    public Account() {
        this.transactionHistory = new ArrayList<>(); // Initialize transaction history
    }


    // Getter for transaction history
    public List<String> getTransactionHistory() {
        return transactionHistory;
    }


    // Methods to add a transaction record
    public void addTransaction(String record) {
        transactionHistory.add(record);
    }


    public int getAccount_number() {
        return account_number;
    }


    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }


    public double getBalance() {
        return balance;
    }


    public void setBalance(double balance) {
        this.balance = balance;
    }


    public Client getOwner() {
        return owner;
    }


    public void setOwner(Client owner) {
        this.owner = owner;
    }


    public String getAccount_type() {
        return account_type;
    }


    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }


    public static void Create_account(){
        int choice;
        Scanner sc = new Scanner(System.in);
        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();
        do {
            System.out.println("\n ======= Type of Account ======");
            System.out.println("1-Savings account");
            System.out.println("2-Current account");
            System.out.println("3-back to Account");
            System.out.println("Enter the choice : ");
            choice = sc.nextInt();


            switch (choice) {
                case 1:
                    sa.Saving_Account();
                    break;
                case 2:
                    ca.CurentAccount();
                    break;
                case 3:
                    break;
            }
        } while (choice != 3);
    }


    public Client RechercheClientIdExiste(int idClient){
        for (Client client : Client.clients){
            if (idClient == client.getId()){
                return client;
            }
        }
        return null;
    }


    // Method to display all accounts
    public static void displayAccounts() {
        System.out.println("\n --- Savings Accounts --- ");
        if (SavingsAccount.savingsAccounts.isEmpty()) {
            System.out.println("No Savings accounts available.");
        } else {
            for (SavingsAccount sa : SavingsAccount.savingsAccounts) {
                System.out.println("\n Account Number: " + sa.getAccount_number() +
                        "\n Owner: " + sa.getOwner().getFull_name() +
                        "\n Balance: " + sa.getBalance() +
                        "\n Interest Rate: " + sa.getInterest_rate());
            }
        }


        System.out.println("\n --- Current Accounts --- ");
        if (CurrentAccount.currentAccounts.isEmpty()) {
            System.out.println("No Current accounts available.");
        } else {
            for (CurrentAccount ca : CurrentAccount.currentAccounts) {
                System.out.println("\n Account Number: " + ca.getAccount_number() +
                        "\n Owner: " + ca.getOwner().getFull_name() +
                        "\n Balance: " + ca.getBalance() +
                        "\n Bank Fees: " + ca.getBank_fees());
            }
        }
    }
}

