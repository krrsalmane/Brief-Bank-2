public class Operations {
    private String type;
    private int date;
    private int amount;
    private String associated_account;
    Account asociated_account;

    public Operations(String type, int date, int amount, String associated_account, Account asociated_account) {
        this.type = type;
        this.date = date;
        this.amount = amount;
        this.associated_account = associated_account;
        this.asociated_account = asociated_account;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAssociated_account() {
        return associated_account;
    }

    public void setAssociated_account(String associated_account) {
        this.associated_account = associated_account;
    }

    public Account getAsociated_account() {
        return asociated_account;
    }

    public void setAsociated_account(Account asociated_account) {
        this.asociated_account = asociated_account;
    }
}
