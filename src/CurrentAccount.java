public class CurrentAccount extends Account {
    private String bank_fees;

    public CurrentAccount(int number, int balance, Client owner, String bank_fees) {
        super(number, balance, owner);
        this.bank_fees = bank_fees;
    }

    public String getBank_fees() {
        return bank_fees;
    }

    public void setBank_fees(String bank_fees) {
        this.bank_fees = bank_fees;
    }
}
