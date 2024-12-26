import java.util.Scanner;

public class CurrentAccount extends Account {
    private String bank_fees;

    public CurrentAccount(int number, int balance, Client owner, String bank_fees) {
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
    public void Curentaccount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter account number");
        int account_number = sc.nextInt();
        System.out.println("enter how much money you have");
        double balance = sc.nextDouble();

    }
}
