

import java.util.ArrayList;
import java.util.Scanner;


public class CurrentAccount extends Account {
    private String bank_fees;
    static ArrayList<CurrentAccount>currentAccounts = new ArrayList<CurrentAccount>();


    public CurrentAccount(int number, double balance, Client owner, String bank_fees) {
        super(number, balance, owner);
        this.bank_fees = bank_fees;
    }


    public CurrentAccount(){
        super();
    }


    public String getBank_fees() {
        return bank_fees;
    }


    public void setBank_fees(String bank_fees) {
        this.bank_fees = bank_fees;
    }
    public void CurentAccount() {
        System.out.println("Enter client ID:");
        int clientId = sc.nextInt();
        sc.nextLine(); // Consume newline character
        Client client = RechercheClientIdExiste(clientId);


        if (client != null) {
            System.out.println("Enter account number:");
            int account_number = sc.nextInt();
            System.out.println("Enter your balance:");
            double balance = sc.nextDouble();
            sc.nextLine(); // Consume newline character


            System.out.println("Enter bank fees:");
            String bank_fees = sc.nextLine();


            // Create and add the CurrentAccount object
            CurrentAccount ca = new CurrentAccount(account_number, balance, client, bank_fees);
            currentAccounts.add(ca);
            System.out.println("Current account added successfully!");
        } else {
            System.out.println("You should add a Client first.");
        }
    }}

