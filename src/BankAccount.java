public class BankAccount {
    String firstName;
    String lastName;
    int accountID;
    double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void constructor() {

    }

    public void deposit(double deposit) {
    }

    public void withdrawal(double withdrawal) {}

    public void setFirstName(String firstName){}
    public void setLastName(String lastName){}
    public void setAccountID(int accountID){}
    public String getFirstName(){}
    public String getLastName(){}
    public int getAccountID(){}

    public double getBalance() {
        return this.balance;
    }

    public void accountSummary() {
        System.out.println("FIX_MEEee");
    }
}