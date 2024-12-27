import java.util.ArrayList;
import java.util.Scanner;

public class CurrentAccount extends Account {
    private String bank_fees;
    static ArrayList<CurrentAccount>currentAccounts = new ArrayList<CurrentAccount>();

    public CurrentAccount(int number, double balance, Client owner) {
        super(number,balance,owner);
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
    public void CurentAccount(){
        System.out.println("enter client Id");
        int clientId = sc.nextInt();
        sc.nextLine();
        Client client= RechercheClientIdExiste(clientId);
        if (client != null){
            System.out.println("enter account number");
            int account_number = sc.nextInt();
            System.out.println("enter how much money you have");
            double balance = sc.nextDouble();
            try {
                balance = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Balance invalide. You should enter a valide  number.");
                return;
            }
            CurrentAccount Ca = new CurrentAccount(account_number,balance,client);
            currentAccounts.add(Ca);
        }else {
            System.out.println("You should add a Client");
        }

    }
}
