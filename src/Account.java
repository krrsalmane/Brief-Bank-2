public  abstract class Account {

  private int number;
  private int balance;
  Client owner;

    public Account(int number, int balance, Client owner) {
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }
}
