import java.util.Scanner;

public  abstract class Account {
    Scanner sc = new Scanner(System.in);

  private int account_number;
  private double balance;
  Client owner;
  private String account_type;

    public Account(int account_number, double balance, Client owner) {
        this.account_number = account_number;
        this.balance = balance;
        this.owner = owner;
    }
    public Account (){}

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
           System.out.println("Enter the choice : ");
           choice = sc.nextInt();

           switch (choice) {
               case 1:
                   sa.Saving_Account();
                  break;
               case 2:
                   ca.CurentAccount();
                   break;


           }
       }while (choice != 3);}
        public  Client RechercheClientIdExiste(int idClient){
            for (Client client : Client.clients){
                if (idClient==client.getId()){
                    return client;
                }
            }
            return null;
        }

}

