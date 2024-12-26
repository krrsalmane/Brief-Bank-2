import java.util.Scanner;

public class SavingsAccount extends Account {
    private double interest_rate;

    public SavingsAccount(double interest_rate) {
        super();
        this.interest_rate = interest_rate;
    }
    public SavingsAccount(){}

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }
    public void  Saving_Account(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter account number");
        int account_number = sc.nextInt();
        System.out.println("enter how much money you have");
        double balance = sc.nextDouble();

    }
    public void calculate_intrest(){
        System.out.println("enter interest rate a year ");
        double balance = getBalance();
        double interest_rate  =(balance*3)/100;
    }
    }

