import java.util.ArrayList;
import java.util.Scanner;

public class SavingsAccount extends Account {
    private double interest_rate;
    static ArrayList<SavingsAccount>savingsAccounts= new ArrayList<>();

    public SavingsAccount(double interest_rate) {
        super();
        this.interest_rate = interest_rate;
    }

    public SavingsAccount(int number,double balance,Client owner){
        super(number,balance,owner);
    }
    public SavingsAccount(){}

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public void  Saving_Account(){

        System.out.println("enter client Id");
        int clientId = sc.nextInt();
        sc.nextLine();
        Client client= RechercheClientIdExiste(clientId);
      if (client != null){
          System.out.println("enter account number");
          int account_number = sc.nextInt();
          System.out.println("enter how much money you have");
          double balance = sc.nextDouble();
          SavingsAccount Sa = new SavingsAccount(account_number,balance,client);
          savingsAccounts.add(Sa);
      }else {
          System.out.println("You should add a Client");
      }
    }
    public void Calculate_Intrest(){
        System.out.println("enter interest rate a year ");
        double balance = getBalance();
        double interest_rate  =(balance*3)/100;
    }
    }

